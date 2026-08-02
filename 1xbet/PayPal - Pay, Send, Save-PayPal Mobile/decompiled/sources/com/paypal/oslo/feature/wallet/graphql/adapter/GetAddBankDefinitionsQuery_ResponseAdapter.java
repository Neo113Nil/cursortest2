package com.paypal.oslo.feature.wallet.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetAddBankDefinitionsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "BankDefinitions", "Item", "Input"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetAddBankDefinitionsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetAddBankDefinitionsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("bankDefinitions");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions bankDefinitions = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bankDefinitions = (com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.BankDefinitions.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (bankDefinitions != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data(bankDefinitions);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "bankDefinitions");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("bankDefinitions");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.BankDefinitions.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getBankDefinitions());
        }
    }

    private GetAddBankDefinitionsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetAddBankDefinitionsQuery_ResponseAdapter$BankDefinitions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$BankDefinitions;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BankDefinitions implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.BankDefinitions INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.BankDefinitions();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("items");
        public static final int $stable = 8;

        private BankDefinitions() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Item.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "items");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.BankDefinitions value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("items");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Item.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getItems());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetAddBankDefinitionsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Item;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Item;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Item;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Item INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Item();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", "dataFormat", "inputs"});
        public static final int $stable = 8;

        private Item() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.BankDataFormat bankDataFormat = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bankDataFormat = com.paypal.oslo.api.graphql.schema.type.adapter.BankDataFormat_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Input.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bankDataFormat == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "dataFormat");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item(obj, bankDataFormat, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "inputs");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Item value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("dataFormat");
            com.paypal.oslo.api.graphql.schema.type.adapter.BankDataFormat_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getDataFormat());
            writer.name("inputs");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Input.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getInputs());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/adapter/GetAddBankDefinitionsQuery_ResponseAdapter$Input;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Input;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Input;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/wallet/graphql/GetAddBankDefinitionsQuery$Input;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Input implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input> {
        public static final com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Input INSTANCE = new com.paypal.oslo.feature.wallet.graphql.adapter.GetAddBankDefinitionsQuery_ResponseAdapter.Input();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "group", "maximumLength", "minimumLength", "prepopulatedValues", "regex", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY});
        public static final int $stable = 8;

        private Input() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            if (r3 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return new com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input(r2, r4, r11, r5, r6, r7, r3.booleanValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "minimumLength");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "maximumLength");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r2 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (r0 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            r11 = r0.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r1 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            r5 = r1.intValue();
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.String str = null;
            java.lang.Boolean bool = null;
            java.lang.String str2 = null;
            java.util.List list = null;
            java.lang.String str3 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.wallet.graphql.GetAddBankDefinitionsQuery.Input value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("group");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGroup());
            writer.name("maximumLength");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getMaximumLength()));
            writer.name("minimumLength");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getMinimumLength()));
            writer.name("prepopulatedValues");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter)).toJson(writer, customScalarAdapters, value.getPrepopulatedValues());
            writer.name("regex");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getRegex());
            writer.name(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY);
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getRequired()));
        }
    }
}
