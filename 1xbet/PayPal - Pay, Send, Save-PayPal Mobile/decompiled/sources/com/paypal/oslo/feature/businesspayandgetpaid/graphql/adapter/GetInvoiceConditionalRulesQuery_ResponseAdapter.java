package com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/adapter/GetInvoiceConditionalRulesQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "InvoiceConditionalRules", "InvoiceTotalPreRules", "Rule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetInvoiceConditionalRulesQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/adapter/GetInvoiceConditionalRulesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data> {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("invoiceConditionalRules");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                invoiceConditionalRules = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceConditionalRules.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data(invoiceConditionalRules);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("invoiceConditionalRules");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceConditionalRules.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getInvoiceConditionalRules());
        }
    }

    private GetInvoiceConditionalRulesQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/adapter/GetInvoiceConditionalRulesQuery_ResponseAdapter$InvoiceConditionalRules;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvoiceConditionalRules implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules> {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceConditionalRules INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceConditionalRules();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"invoiceTotalPreRules", "rules"});
        public static final int $stable = 8;

        private InvoiceConditionalRules() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    invoiceTotalPreRules = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceTotalPreRules.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Rule.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules(invoiceTotalPreRules, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "rules");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("invoiceTotalPreRules");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceTotalPreRules.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getInvoiceTotalPreRules());
            writer.name("rules");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Rule.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getRules());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/adapter/GetInvoiceConditionalRulesQuery_ResponseAdapter$InvoiceTotalPreRules;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvoiceTotalPreRules implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules> {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceTotalPreRules INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.InvoiceTotalPreRules();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InvoiceTotalPreRules() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment fromJson = com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragmentImpl_ResponseAdapter.MoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/adapter/GetInvoiceConditionalRulesQuery_ResponseAdapter$Rule;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Rule;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Rule;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Rule;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Rule implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Rule INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Rule();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"conditionalRuleType", "conditionalRuleValueType", "conditionalRuleValue", "effectiveDate", "isActive", "isCurrentlyApplicable"});
        public static final int $stable = 8;

        private Rule() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType invoiceConditionalRuleType = null;
            com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType invoiceDiscountType = null;
            java.lang.String str = null;
            java.lang.Object obj = null;
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    invoiceConditionalRuleType = com.paypal.oslo.api.graphql.schema.type.adapter.InvoiceConditionalRuleType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    invoiceDiscountType = (com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.InvoiceDiscountType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (invoiceConditionalRuleType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "conditionalRuleType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule(invoiceConditionalRuleType, invoiceDiscountType, str, obj, bool, bool2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "effectiveDate");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("conditionalRuleType");
            com.paypal.oslo.api.graphql.schema.type.adapter.InvoiceConditionalRuleType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getConditionalRuleType());
            writer.name("conditionalRuleValueType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.InvoiceDiscountType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getConditionalRuleValueType());
            writer.name("conditionalRuleValue");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getConditionalRuleValue());
            writer.name("effectiveDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getEffectiveDate());
            writer.name("isActive");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.isActive());
            writer.name("isCurrentlyApplicable");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.isCurrentlyApplicable());
        }
    }
}
