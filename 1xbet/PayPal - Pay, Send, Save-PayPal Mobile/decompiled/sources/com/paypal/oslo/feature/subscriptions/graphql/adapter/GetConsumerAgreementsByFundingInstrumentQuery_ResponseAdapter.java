package com.paypal.oslo.feature.subscriptions.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "ConsumerAgreementsByFundingInstrument", "FundingInstrument", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "ConsumerAgreement", "PreferredFundingInstrument", "BalanceFundingInstrument", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "Merchant1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("consumerAgreementsByFundingInstrument");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreementsByFundingInstrument.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "consumerAgreementsByFundingInstrument");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("consumerAgreementsByFundingInstrument");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreementsByFundingInstrument.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getConsumerAgreementsByFundingInstrument());
        }
    }

    private GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$ConsumerAgreementsByFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConsumerAgreementsByFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreementsByFundingInstrument INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreementsByFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fundingInstrument", "consumerAgreements"});
        public static final int $stable = 8;

        private ConsumerAgreementsByFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    fundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.FundingInstrument.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreement.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument(fundingInstrument, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "consumerAgreements");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fundingInstrument");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.FundingInstrument.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFundingInstrument());
            writer.name("consumerAgreements");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreement.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getConsumerAgreements());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$FundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.FundingInstrument INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.FundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "lastDigits", "name", "thumbnailImageUrl", "type", "balance"});
        public static final int $stable = 8;

        private FundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    balance = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Balance.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str3 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (fundingInstrumentType != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument(str, str2, str3, obj, fundingInstrumentType, balance);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("thumbnailImageUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getThumbnailImageUrl());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("balance");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Balance.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBalance());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$Balance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Balance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Balance INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Balance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private Balance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$ConsumerAgreement;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreement;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreement;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreement;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConsumerAgreement implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreement INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.ConsumerAgreement();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type", "status", "balancePreference", "preferredFundingInstrument", "balanceFundingInstrument", "merchant"});
        public static final int $stable = 8;

        private ConsumerAgreement() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement(r2, r3, r4, r5, r6, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x008e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "merchant");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r2 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r3 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (r4 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r8 == null) goto L18;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus = null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument = null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        consumerAgreementType = com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        consumerAgreementStatus = com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        consumerAgreementBalancePreference = (com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementBalancePreference_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        preferredFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.PreferredFundingInstrument.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        balanceFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.BalanceFundingInstrument.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        merchant = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("balancePreference");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ConsumerAgreementBalancePreference_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getBalancePreference());
            writer.name("preferredFundingInstrument");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.PreferredFundingInstrument.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPreferredFundingInstrument());
            writer.name("balanceFundingInstrument");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.BalanceFundingInstrument.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBalanceFundingInstrument());
            writer.name("merchant");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getMerchant());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$PreferredFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PreferredFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.PreferredFundingInstrument INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.PreferredFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name", "type", "lastDigits"});
        public static final int $stable = 8;

        private PreferredFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (fundingInstrumentType != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument(str, str2, fundingInstrumentType, str3);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$BalanceFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BalanceFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.BalanceFundingInstrument INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.BalanceFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type"});
        public static final int $stable = 8;

        private BalanceFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    fundingInstrumentType = com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (fundingInstrumentType != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument(str, fundingInstrumentType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.FundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$Merchant;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Merchant implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("merchant");
        public static final int $stable = 8;

        private Merchant() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1 = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                merchant1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant(merchant1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("merchant");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getMerchant());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/adapter/GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter$Merchant1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Merchant1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1> {
        public static final com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant1 INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Merchant1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name", "logoUrl"});
        public static final int $stable = 8;

        private Merchant1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
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
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1(str, str2, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("logoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLogoUrl());
        }
    }
}
