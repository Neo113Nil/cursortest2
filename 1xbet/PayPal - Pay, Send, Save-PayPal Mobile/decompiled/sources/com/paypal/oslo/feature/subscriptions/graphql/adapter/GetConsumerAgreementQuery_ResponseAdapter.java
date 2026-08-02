package com.paypal.oslo.feature.subscriptions.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "ConsumerAgreement", "LastPayment", "Amount", "PreferredFundingInstrument", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "BalanceFundingInstrument", "Balance1", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "Merchant1", "ContactPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetConsumerAgreementQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("consumerAgreement");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                consumerAgreement = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ConsumerAgreement.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (consumerAgreement != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data(consumerAgreement);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "consumerAgreement");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("consumerAgreement");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ConsumerAgreement.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getConsumerAgreement());
        }
    }

    private GetConsumerAgreementQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$ConsumerAgreement;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConsumerAgreement implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ConsumerAgreement INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ConsumerAgreement();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "status", "type", "billingAgreementStatus", "balancePreference", "managementType", "startedTime", "lastPayment", "preferredFundingInstrument", "balanceFundingInstrument", "merchant"});
        public static final int $stable = 8;

        private ConsumerAgreement() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            if (r14 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00d8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "merchant");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00e2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00e3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "managementType");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ed, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "billingAgreementStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00f8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00f9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0105, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0110, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0111, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x011b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r4 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r5 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            if (r6 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r7 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        
            if (r9 == null) goto L26;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType consumerAgreementManagementType = null;
            java.lang.Object obj = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant merchant = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        consumerAgreementStatus = com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        consumerAgreementType = com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        consumerAgreementBalancePreference = (com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementBalancePreference_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        consumerAgreementManagementType = com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementManagementType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        lastPayment = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.LastPayment.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        preferredFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.PreferredFundingInstrument.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        balanceFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.BalanceFundingInstrument.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        merchant = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("billingAgreementStatus");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBillingAgreementStatus());
            writer.name("balancePreference");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementBalancePreference_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getBalancePreference());
            writer.name("managementType");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementManagementType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getManagementType());
            writer.name("startedTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getStartedTime());
            writer.name("lastPayment");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.LastPayment.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getLastPayment());
            writer.name("preferredFundingInstrument");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.PreferredFundingInstrument.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPreferredFundingInstrument());
            writer.name("balanceFundingInstrument");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.BalanceFundingInstrument.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBalanceFundingInstrument());
            writer.name("merchant");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getMerchant());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$LastPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LastPayment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.LastPayment INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.LastPayment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"paymentTime", "amount"});
        public static final int $stable = 8;

        private LastPayment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    amount = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Amount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "paymentTime");
                throw new kotlin.KotlinNothingValueException();
            }
            if (amount != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment(obj, amount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "amount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("paymentTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPaymentTime());
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Amount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$PreferredFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PreferredFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.PreferredFundingInstrument INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.PreferredFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type", "name", "lastDigits", "primaryImageUrl", "thumbnailImageUrl", "balance"});
        public static final int $stable = 8;

        private PreferredFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r3 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r4 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument(r2, r3, r4, r5, r6, r7, r8);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        balance = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
            writer.name("primaryImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryImageUrl());
            writer.name("thumbnailImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getThumbnailImageUrl());
            writer.name("balance");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBalance());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$Balance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Balance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private Balance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$BalanceFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.BalanceFundingInstrument INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.BalanceFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type", "name", "lastDigits", "primaryImageUrl", "thumbnailImageUrl", "balance"});
        public static final int $stable = 8;

        private BalanceFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r3 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r4 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument(r2, r3, r4, r5, r6, r7, r8);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        balance1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
            writer.name("primaryImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryImageUrl());
            writer.name("thumbnailImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getThumbnailImageUrl());
            writer.name("balance");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBalance());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$Balance1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Balance1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance1 INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Balance1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private Balance1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$Merchant;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Merchant implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("merchant");
        public static final int $stable = 8;

        private Merchant() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1 = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                merchant1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant(merchant1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("merchant");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getMerchant());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$Merchant1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Merchant1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant1 INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Merchant1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name", "logoUrl", "websiteUrl", "contactEmail", "contactPhone"});
        public static final int $stable = 8;

        private Merchant1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    contactPhone = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ContactPhone.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1(str, str2, obj, obj2, obj3, contactPhone);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("logoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLogoUrl());
            writer.name("websiteUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getWebsiteUrl());
            writer.name("contactEmail");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getContactEmail());
            writer.name("contactPhone");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ContactPhone.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getContactPhone());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementQuery_ResponseAdapter$ContactPhone;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ContactPhone implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ContactPhone INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.ContactPhone();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"countryCode", "extensionNumber", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber});
        public static final int $stable = 8;

        private ContactPhone() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone(str, str2, str3);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name("extensionNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExtensionNumber());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNationalNumber());
        }
    }
}
