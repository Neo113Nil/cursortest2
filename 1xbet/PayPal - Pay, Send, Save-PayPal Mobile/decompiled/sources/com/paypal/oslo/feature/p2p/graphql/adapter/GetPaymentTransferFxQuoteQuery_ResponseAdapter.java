package com.paypal.oslo.feature.p2p.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "PaymentTransferFxQuote", "FxQuote", "AmountFrom", "AmountTo", "ExchangeRate", "FromCurrency", "ToCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetPaymentTransferFxQuoteQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("paymentTransferFxQuote");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote paymentTransferFxQuote = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                paymentTransferFxQuote = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.PaymentTransferFxQuote.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (paymentTransferFxQuote != null) {
                return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data(paymentTransferFxQuote);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "paymentTransferFxQuote");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("paymentTransferFxQuote");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.PaymentTransferFxQuote.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPaymentTransferFxQuote());
        }
    }

    private GetPaymentTransferFxQuoteQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$PaymentTransferFxQuote;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$PaymentTransferFxQuote;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$PaymentTransferFxQuote;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$PaymentTransferFxQuote;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentTransferFxQuote implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.PaymentTransferFxQuote INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.PaymentTransferFxQuote();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("fxQuote");
        public static final int $stable = 8;

        private PaymentTransferFxQuote() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote fxQuote = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                fxQuote = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FxQuote.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (fxQuote != null) {
                return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote(fxQuote);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "fxQuote");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fxQuote");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FxQuote.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getFxQuote());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$FxQuote;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FxQuote;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FxQuote;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FxQuote;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FxQuote implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FxQuote INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FxQuote();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fxQuoteId", "amountFrom", "amountTo", "exchangeRate"});
        public static final int $stable = 8;

        private FxQuote() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountFrom amountFrom = null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountTo amountTo = null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate exchangeRate = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    amountFrom = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountFrom) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountFrom.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    amountTo = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountTo) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountTo.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    exchangeRate = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ExchangeRate.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
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
                return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote(str, amountFrom, amountTo, exchangeRate);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "exchangeRate");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fxQuoteId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getFxQuoteId());
            writer.name("amountFrom");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountFrom.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmountFrom());
            writer.name("amountTo");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountTo.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmountTo());
            writer.name("exchangeRate");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ExchangeRate.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getExchangeRate());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$AmountFrom;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$AmountFrom;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$AmountFrom;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$AmountFrom;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountFrom implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountFrom> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountFrom INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountFrom();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AmountFrom() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountFrom fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountFrom(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountFrom value) {
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$AmountTo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$AmountTo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$AmountTo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$AmountTo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountTo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountTo> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountTo INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.AmountTo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AmountTo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountTo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountTo(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.AmountTo value) {
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$ExchangeRate;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$ExchangeRate;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$ExchangeRate;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$ExchangeRate;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExchangeRate implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ExchangeRate INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ExchangeRate();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO});
        public static final int $stable = 8;

        private ExchangeRate() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FromCurrency fromCurrency = null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ToCurrency toCurrency = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    fromCurrency = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FromCurrency) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FromCurrency.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    toCurrency = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ToCurrency) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ToCurrency.INSTANCE, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (fromCurrency == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM);
                throw new kotlin.KotlinNothingValueException();
            }
            if (toCurrency != null) {
                return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate(fromCurrency, toCurrency);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM);
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FromCurrency.INSTANCE, true).toJson(writer, customScalarAdapters, value.getFromCurrency());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO);
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ToCurrency.INSTANCE, true).toJson(writer, customScalarAdapters, value.getToCurrency());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$FromCurrency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FromCurrency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FromCurrency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FromCurrency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FromCurrency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FromCurrency> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FromCurrency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.FromCurrency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FromCurrency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FromCurrency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FromCurrency(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FromCurrency value) {
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

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/GetPaymentTransferFxQuoteQuery_ResponseAdapter$ToCurrency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$ToCurrency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$ToCurrency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$ToCurrency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ToCurrency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ToCurrency> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ToCurrency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFxQuoteQuery_ResponseAdapter.ToCurrency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ToCurrency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ToCurrency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ToCurrency(str, p2PMoneyFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ToCurrency value) {
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
