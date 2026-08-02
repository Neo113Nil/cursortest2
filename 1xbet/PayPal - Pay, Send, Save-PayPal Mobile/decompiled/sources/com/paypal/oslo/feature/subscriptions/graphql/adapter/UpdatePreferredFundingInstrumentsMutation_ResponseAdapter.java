package com.paypal.oslo.feature.subscriptions.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/UpdatePreferredFundingInstrumentsMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.OPERATION_NAME, "FailedConsumerAgreement"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdatePreferredFundingInstrumentsMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/UpdatePreferredFundingInstrumentsMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updatePreferredFundingInstruments");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updatePreferredFundingInstruments = (com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.UpdatePreferredFundingInstruments.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (updatePreferredFundingInstruments != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data(updatePreferredFundingInstruments);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "updatePreferredFundingInstruments");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updatePreferredFundingInstruments");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.UpdatePreferredFundingInstruments.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getUpdatePreferredFundingInstruments());
        }
    }

    private UpdatePreferredFundingInstrumentsMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/UpdatePreferredFundingInstrumentsMutation_ResponseAdapter$UpdatePreferredFundingInstruments;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdatePreferredFundingInstruments implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.UpdatePreferredFundingInstruments INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.UpdatePreferredFundingInstruments();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"updatedConsumerAgreementIds", "failedConsumerAgreements"});
        public static final int $stable = 8;

        private UpdatePreferredFundingInstruments() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.FailedConsumerAgreement.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments(list, list2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updatedConsumerAgreementIds");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter)).toJson(writer, customScalarAdapters, value.getUpdatedConsumerAgreementIds());
            writer.name("failedConsumerAgreements");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.FailedConsumerAgreement.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getFailedConsumerAgreements());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/UpdatePreferredFundingInstrumentsMutation_ResponseAdapter$FailedConsumerAgreement;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$FailedConsumerAgreement;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$FailedConsumerAgreement;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$FailedConsumerAgreement;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FailedConsumerAgreement implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.FailedConsumerAgreement INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.FailedConsumerAgreement();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"consumerAgreementId", "reason"});
        public static final int $stable = 8;

        private FailedConsumerAgreement() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    failUpdatePreferredFundingInstrumentReason = com.paypal.oslo.api.graphql.schema.type.adapter.FailUpdatePreferredFundingInstrumentReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "consumerAgreementId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (failUpdatePreferredFundingInstrumentReason != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement(str, failUpdatePreferredFundingInstrumentReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "reason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("consumerAgreementId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getConsumerAgreementId());
            writer.name("reason");
            com.paypal.oslo.api.graphql.schema.type.adapter.FailUpdatePreferredFundingInstrumentReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReason());
        }
    }
}
