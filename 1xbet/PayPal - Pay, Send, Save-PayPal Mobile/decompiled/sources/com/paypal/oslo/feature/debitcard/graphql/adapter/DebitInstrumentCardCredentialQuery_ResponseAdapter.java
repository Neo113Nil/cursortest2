package com.paypal.oslo.feature.debitcard.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/DebitInstrumentCardCredentialQuery_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentCardCredentialQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/DebitInstrumentCardCredentialQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("debitInstrumentCardCredential");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                debitInstrumentCardCredential = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.DebitInstrumentCardCredential.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data(debitInstrumentCardCredential);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("debitInstrumentCardCredential");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.DebitInstrumentCardCredential.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDebitInstrumentCardCredential());
        }
    }

    private DebitInstrumentCardCredentialQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/adapter/DebitInstrumentCardCredentialQuery_ResponseAdapter$DebitInstrumentCardCredential;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DebitInstrumentCardCredential implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential> {
        public static final com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.DebitInstrumentCardCredential INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.DebitInstrumentCardCredential();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardNumber", "lastNChars", "cardVerificationCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "status", "scheme"});
        public static final int $stable = 8;

        private DebitInstrumentCardCredential() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0083, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r2 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0079, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.Object obj4 = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = null;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        debitInstrumentProductName = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentProductName_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj4 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        debitInstrumentLifecycleState = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentLifecycleState_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        cardBrand = (com.paypal.oslo.api.graphql.schema.type.CardBrand) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CardBrand_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentProductName_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getProductName());
            writer.name("cardNumber");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCardNumber());
            writer.name("lastNChars");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLastNChars());
            writer.name("cardVerificationCode");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCardVerificationCode());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate);
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getExpiryDate());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentLifecycleState_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("scheme");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CardBrand_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getScheme());
        }
    }
}
