package com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/adapter/GetTaxReportsAndFaqsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "TaxReports", "Item", "Correction", "IpsArticle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetTaxReportsAndFaqsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/adapter/GetTaxReportsAndFaqsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data> {
        public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"taxReports", "ipsArticles"});
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports taxReports = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    taxReports = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.TaxReports.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.IpsArticle.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                }
            }
            if (taxReports != null) {
                return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data(taxReports, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "taxReports");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("taxReports");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.TaxReports.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTaxReports());
            writer.name("ipsArticles");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.IpsArticle.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getIpsArticles());
        }
    }

    private GetTaxReportsAndFaqsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/adapter/GetTaxReportsAndFaqsQuery_ResponseAdapter$TaxReports;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TaxReports implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports> {
        public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.TaxReports INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.TaxReports();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("items");
        public static final int $stable = 8;

        private TaxReports() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Item.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Item.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/adapter/GetTaxReportsAndFaqsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Item;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Item;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Item;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item> {
        public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Item INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Item();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "mode", "status", "type", "name", "createdTime", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "downloadId", "correctionFlowStatus", "correction"});
        public static final int $stable = 8;

        private Item() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r5 == null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "type");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.TaxReportMode taxReportMode = null;
            com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus = null;
            com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus = null;
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction correction = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        taxReportMode = (com.paypal.oslo.api.graphql.schema.type.TaxReportMode) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportMode_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        taxReportStatus = (com.paypal.oslo.api.graphql.schema.type.TaxReportStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        taxReportType = com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        taxReportCorrectionFlowStatus = (com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportCorrectionFlowStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        correction = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Correction.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("mode");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportMode_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getMode());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("createdTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCreatedTime());
            writer.name(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAccountNumber());
            writer.name("downloadId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDownloadId());
            writer.name("correctionFlowStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportCorrectionFlowStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCorrectionFlowStatus());
            writer.name("correction");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Correction.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCorrection());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/adapter/GetTaxReportsAndFaqsQuery_ResponseAdapter$Correction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Correction;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Correction;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$Correction;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Correction implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction> {
        public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Correction INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.Correction();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"status", "id", "deepLink"});
        public static final int $stable = 8;

        private Correction() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus = null;
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    taxReportCorrectionStatus = com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportCorrectionStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (taxReportCorrectionStatus == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "status");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction(taxReportCorrectionStatus, str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "deepLink");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.TaxReportCorrectionStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("deepLink");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getDeepLink());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/adapter/GetTaxReportsAndFaqsQuery_ResponseAdapter$IpsArticle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$IpsArticle;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$IpsArticle;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$IpsArticle;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IpsArticle implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle> {
        public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.IpsArticle INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsAndFaqsQuery_ResponseAdapter.IpsArticle();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "title", "rank"});
        public static final int $stable = 8;

        private IpsArticle() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Integer num = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "title");
                throw new kotlin.KotlinNothingValueException();
            }
            if (num != null) {
                return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle(str, str2, num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "rank");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.IpsArticle value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.name("rank");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getRank()));
        }
    }
}
