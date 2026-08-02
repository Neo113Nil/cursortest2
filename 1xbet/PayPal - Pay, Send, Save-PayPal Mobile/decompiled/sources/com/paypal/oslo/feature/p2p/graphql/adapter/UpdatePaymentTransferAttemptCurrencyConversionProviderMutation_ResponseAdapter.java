package com.paypal.oslo.feature.p2p.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.OPERATION_NAME, "PaymentTransferAttempt", "FundingOptions", "FxQuote", "AmountFrom", "AmountTo", "ExchangeRate", "FromCurrency", "ToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updatePaymentTransferAttemptCurrencyConversionProvider");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider updatePaymentTransferAttemptCurrencyConversionProvider = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updatePaymentTransferAttemptCurrencyConversionProvider = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.UpdatePaymentTransferAttemptCurrencyConversionProvider.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (updatePaymentTransferAttemptCurrencyConversionProvider != null) {
                return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data(updatePaymentTransferAttemptCurrencyConversionProvider);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "updatePaymentTransferAttemptCurrencyConversionProvider");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updatePaymentTransferAttemptCurrencyConversionProvider");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.UpdatePaymentTransferAttemptCurrencyConversionProvider.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getUpdatePaymentTransferAttemptCurrencyConversionProvider());
        }
    }

    private UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$UpdatePaymentTransferAttemptCurrencyConversionProvider;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdatePaymentTransferAttemptCurrencyConversionProvider implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.UpdatePaymentTransferAttemptCurrencyConversionProvider INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.UpdatePaymentTransferAttemptCurrencyConversionProvider();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("paymentTransferAttempt");
        public static final int $stable = 8;

        private UpdatePaymentTransferAttemptCurrencyConversionProvider() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt paymentTransferAttempt = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                paymentTransferAttempt = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.PaymentTransferAttempt.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (paymentTransferAttempt != null) {
                return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider(paymentTransferAttempt);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "paymentTransferAttempt");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.UpdatePaymentTransferAttemptCurrencyConversionProvider value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("paymentTransferAttempt");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.PaymentTransferAttempt.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPaymentTransferAttempt());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$PaymentTransferAttempt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$PaymentTransferAttempt;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentTransferAttempt implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.PaymentTransferAttempt INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.PaymentTransferAttempt();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "fundingOptions", "fxQuote"});
        public static final int $stable = 8;

        private PaymentTransferAttempt() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fundingOptions = null;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fxQuote = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    fundingOptions = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FundingOptions.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    fxQuote = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FxQuote.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt(obj, fundingOptions, fxQuote);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.PaymentTransferAttempt value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("fundingOptions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FundingOptions.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getFundingOptions());
            writer.name("fxQuote");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FxQuote.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFxQuote());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$FundingOptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FundingOptions;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingOptions implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FundingOptions INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FundingOptions();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FundingOptions() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragmentImpl_ResponseAdapter.P2PFundingOptionsFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FundingOptions value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragmentImpl_ResponseAdapter.P2PFundingOptionsFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getP2PFundingOptionsFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$FxQuote;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FxQuote;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FxQuote implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FxQuote INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FxQuote();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fxQuoteId", "amountFrom", "amountTo", "exchangeRate"});
        public static final int $stable = 8;

        private FxQuote() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom amountFrom = null;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo amountTo = null;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate exchangeRate = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    amountFrom = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountFrom.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    amountTo = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountTo.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    exchangeRate = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ExchangeRate.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "fxQuoteId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (amountFrom == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "amountFrom");
                throw new kotlin.KotlinNothingValueException();
            }
            if (amountTo == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "amountTo");
                throw new kotlin.KotlinNothingValueException();
            }
            if (exchangeRate != null) {
                return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote(str, amountFrom, amountTo, exchangeRate);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "exchangeRate");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FxQuote value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fxQuoteId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getFxQuoteId());
            writer.name("amountFrom");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountFrom.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmountFrom());
            writer.name("amountTo");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountTo.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmountTo());
            writer.name("exchangeRate");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ExchangeRate.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getExchangeRate());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$AmountFrom;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountFrom;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountFrom implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountFrom INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountFrom();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AmountFrom() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("Money"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                p2PMoneyFragment = com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountFrom value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getP2PMoneyFragment() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getP2PMoneyFragment());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$AmountTo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$AmountTo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountTo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountTo INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.AmountTo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AmountTo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("Money"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                p2PMoneyFragment = com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.AmountTo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getP2PMoneyFragment() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getP2PMoneyFragment());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$ExchangeRate;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ExchangeRate;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExchangeRate implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ExchangeRate INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ExchangeRate();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO});
        public static final int $stable = 8;

        private ExchangeRate() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromCurrency = null;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency toCurrency = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    fromCurrency = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FromCurrency.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    toCurrency = (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ToCurrency.INSTANCE, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (fromCurrency == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM);
                throw new kotlin.KotlinNothingValueException();
            }
            if (toCurrency != null) {
                return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate(fromCurrency, toCurrency);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ExchangeRate value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM);
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FromCurrency.INSTANCE, true).toJson(writer, customScalarAdapters, value.getFromCurrency());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO);
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ToCurrency.INSTANCE, true).toJson(writer, customScalarAdapters, value.getToCurrency());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$FromCurrency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$FromCurrency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FromCurrency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FromCurrency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.FromCurrency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FromCurrency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("Money"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                p2PMoneyFragment = com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.FromCurrency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getP2PMoneyFragment() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getP2PMoneyFragment());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter$ToCurrency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptCurrencyConversionProviderMutation$ToCurrency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ToCurrency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ToCurrency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation_ResponseAdapter.ToCurrency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ToCurrency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("Money"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                p2PMoneyFragment = com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptCurrencyConversionProviderMutation.ToCurrency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getP2PMoneyFragment() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getP2PMoneyFragment());
            }
        }
    }
}
