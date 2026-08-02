package com.paypal.oslo.feature.savings.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/GetSavingsLandingPageDataQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "SavingsAccountFeatures"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetSavingsLandingPageDataQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/GetSavingsLandingPageDataQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("savingsAccountFeatures");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                savingsAccountFeatures = (com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.SavingsAccountFeatures.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (savingsAccountFeatures != null) {
                return new com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data(savingsAccountFeatures);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "savingsAccountFeatures");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("savingsAccountFeatures");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.SavingsAccountFeatures.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getSavingsAccountFeatures());
        }
    }

    private GetSavingsLandingPageDataQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/GetSavingsLandingPageDataQuery_ResponseAdapter$SavingsAccountFeatures;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$SavingsAccountFeatures;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavingsAccountFeatures implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.SavingsAccountFeatures INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsLandingPageDataQuery_ResponseAdapter.SavingsAccountFeatures();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"annualPercentageYield", "countryCode", "marketingNationalAverageRateMultiplierText", "marketingNationalAverageReportDate", "marketingRateEffectiveDate"});
        public static final int $stable = 8;

        private SavingsAccountFeatures() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.String str = null;
            java.lang.Object obj3 = null;
            java.lang.Object obj4 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj3 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    obj4 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "annualPercentageYield");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "countryCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "marketingNationalAverageRateMultiplierText");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj3 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "marketingNationalAverageReportDate");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj4 != null) {
                return new com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures(obj, obj2, str, obj3, obj4);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "marketingRateEffectiveDate");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("annualPercentageYield");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getAnnualPercentageYield());
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name("marketingNationalAverageRateMultiplierText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMarketingNationalAverageRateMultiplierText());
            writer.name("marketingNationalAverageReportDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getMarketingNationalAverageReportDate());
            writer.name("marketingRateEffectiveDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getMarketingRateEffectiveDate());
        }
    }
}
