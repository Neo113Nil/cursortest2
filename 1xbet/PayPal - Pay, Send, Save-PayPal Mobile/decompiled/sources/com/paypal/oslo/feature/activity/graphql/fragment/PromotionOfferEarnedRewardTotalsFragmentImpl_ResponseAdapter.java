package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PromotionOfferEarnedRewardTotalsFragment", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter$PromotionOfferEarnedRewardTotalsFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PromotionOfferEarnedRewardTotalsFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.PromotionOfferEarnedRewardTotalsFragment INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.PromotionOfferEarnedRewardTotalsFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"amounts", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY});
        public static final int $stable = 8;

        private PromotionOfferEarnedRewardTotalsFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.Amount.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment(list, obj);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("amounts");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.Amount.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getAmounts());
            writer.name(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY);
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPoints());
        }
    }

    private PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionOfferEarnedRewardTotalsFragment$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityMoneyFragment());
        }
    }
}
