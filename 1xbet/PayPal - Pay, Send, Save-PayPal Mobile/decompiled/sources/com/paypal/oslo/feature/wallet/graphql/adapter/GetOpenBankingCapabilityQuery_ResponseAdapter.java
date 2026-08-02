package com.paypal.oslo.feature.wallet.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingCapabilityQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "OpenBankingCapability", "Institution"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetOpenBankingCapabilityQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingCapabilityQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("openBankingCapability");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                openBankingCapability = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.OpenBankingCapability.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data(openBankingCapability);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("openBankingCapability");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.OpenBankingCapability.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOpenBankingCapability());
        }
    }

    private GetOpenBankingCapabilityQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingCapabilityQuery_ResponseAdapter$OpenBankingCapability;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OpenBankingCapability implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.OpenBankingCapability INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.OpenBankingCapability();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"aggregatorName", "bankName", "externalBankId", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "internalInstitutionId", "inlineLogoUrl", "primaryLogoUrl", "institutions"});
        public static final int $stable = 8;

        private OpenBankingCapability() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0086, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "institutions");
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0090, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "bankName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r3 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        
            if (r9 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = null;
            java.lang.String str3 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.util.List list = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        bankAggregatorName = (com.paypal.oslo.api.graphql.schema.type.BankAggregatorName) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bankIntegrationType = (com.paypal.oslo.api.graphql.schema.type.BankIntegrationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankIntegrationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Institution.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("aggregatorName");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getAggregatorName());
            writer.name("bankName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBankName());
            writer.name("externalBankId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExternalBankId());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankIntegrationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getIntegrationType());
            writer.name("internalInstitutionId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getInternalInstitutionId());
            writer.name("inlineLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getInlineLogoUrl());
            writer.name("primaryLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryLogoUrl());
            writer.name("institutions");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Institution.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getInstitutions());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetOpenBankingCapabilityQuery_ResponseAdapter$Institution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Institution implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Institution INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Institution();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"bankName", "externalBankId", "inlineLogoUrl", "primaryLogoUrl", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "internalInstitutionId", "institutionUrl", "rank", "aggregatorName", "countryCode"});
        public static final int $stable = 8;

        private Institution() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x008d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "countryCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "externalBankId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "bankName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r2 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r3 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            if (r11 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = null;
            java.lang.String str3 = null;
            java.lang.Object obj3 = null;
            java.lang.Integer num = null;
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = null;
            java.lang.Object obj4 = null;
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
                        bankIntegrationType = (com.paypal.oslo.api.graphql.schema.type.BankIntegrationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankIntegrationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bankAggregatorName = (com.paypal.oslo.api.graphql.schema.type.BankAggregatorName) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        obj4 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("bankName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBankName());
            writer.name("externalBankId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getExternalBankId());
            writer.name("inlineLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getInlineLogoUrl());
            writer.name("primaryLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryLogoUrl());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankIntegrationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getIntegrationType());
            writer.name("internalInstitutionId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getInternalInstitutionId());
            writer.name("institutionUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getInstitutionUrl());
            writer.name("rank");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getRank());
            writer.name("aggregatorName");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BankAggregatorName_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getAggregatorName());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
        }
    }
}
