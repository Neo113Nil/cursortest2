package com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFieldsImpl_ResponseAdapter;", "", "<init>", "()V", "CardFundingFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardFundingFieldsImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFieldsImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFieldsImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFieldsImpl_ResponseAdapter$CardFundingFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFields;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFields;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/CardFundingFields;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardFundingFields implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFieldsImpl_ResponseAdapter.CardFundingFields INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFieldsImpl_ResponseAdapter.CardFundingFields();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"subtype", "cardBrand", "lastDigits", "rewardId"});
        public static final int $stable = 8;

        private CardFundingFields() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType externalCardSubType = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalCardSubType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardSubType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    externalCardBrand = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardBrand_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalCardSubType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "subtype");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields(externalCardSubType, externalCardBrand, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "lastDigits");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.CardFundingFields value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("subtype");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardSubType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getSubtype());
            writer.name("cardBrand");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardBrand_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCardBrand());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
            writer.name("rewardId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getRewardId());
        }
    }

    private CardFundingFieldsImpl_ResponseAdapter() {
    }
}
