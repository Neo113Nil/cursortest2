package com.paypal.oslo.feature.wallet.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/OpenBankingInstitutionsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OPERATION_NAME, "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OpenBankingInstitutionsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/OpenBankingInstitutionsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("openBankingInstitutions");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions openBankingInstitutions = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                openBankingInstitutions = (com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.OpenBankingInstitutions.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data(openBankingInstitutions);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("openBankingInstitutions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.OpenBankingInstitutions.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOpenBankingInstitutions());
        }
    }

    private OpenBankingInstitutionsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/OpenBankingInstitutionsQuery_ResponseAdapter$OpenBankingInstitutions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$OpenBankingInstitutions;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$OpenBankingInstitutions;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$OpenBankingInstitutions;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OpenBankingInstitutions implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.OpenBankingInstitutions INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.OpenBankingInstitutions();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("items");
        public static final int $stable = 8;

        private OpenBankingInstitutions() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.Item.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "items");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.OpenBankingInstitutions value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.Item.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/OpenBankingInstitutionsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$Item;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$Item;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/OpenBankingInstitutionsQuery$Item;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.Item INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.OpenBankingInstitutionsQuery_ResponseAdapter.Item();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"externalBankId", "bankName", "inlineLogoUrl", "primaryLogoUrl", "countryCode", "rank", "institutionUrl", "internalInstitutionId", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "aggregatorName", "groupName", "groupRank"});
        public static final int $stable = 8;

        private Item() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "countryCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00b3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00b4, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "bankName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "externalBankId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r4 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r5 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            if (r8 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        
            return new com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.Integer num = null;
            java.lang.Object obj4 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = null;
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = null;
            java.lang.String str4 = null;
            java.lang.Integer num2 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj3 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj4 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bankIntegrationType = (com.paypal.oslo.api.graphql.schema.type.BankIntegrationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankIntegrationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bankAggregatorName = (com.paypal.oslo.api.graphql.schema.type.BankAggregatorName) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num2 = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.OpenBankingInstitutionsQuery.Item value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("externalBankId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getExternalBankId());
            writer.name("bankName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBankName());
            writer.name("inlineLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getInlineLogoUrl());
            writer.name("primaryLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryLogoUrl());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name("rank");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getRank());
            writer.name("institutionUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getInstitutionUrl());
            writer.name("internalInstitutionId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getInternalInstitutionId());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankIntegrationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getIntegrationType());
            writer.name("aggregatorName");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getAggregatorName());
            writer.name("groupName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGroupName());
            writer.name("groupRank");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getGroupRank());
        }
    }
}
