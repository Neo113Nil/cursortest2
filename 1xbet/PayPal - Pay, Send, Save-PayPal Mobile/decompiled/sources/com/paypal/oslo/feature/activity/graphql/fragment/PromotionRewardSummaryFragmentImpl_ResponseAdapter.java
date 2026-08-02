package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PromotionRewardSummaryFragment", "EarnedReward", "OnPromotionOfferEarnedRewardCurrency", "Amount", "OnPromotionOfferEarnedRewardPoints", "RewardProgress", "PendingRewardTotals", "CompletedRewardTotals"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PromotionRewardSummaryFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$PromotionRewardSummaryFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PromotionRewardSummaryFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.PromotionRewardSummaryFragment INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.PromotionRewardSummaryFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"earnedRewards", "rewardProgress", "pendingRewardTotals", "completedRewardTotals"});
        public static final int $stable = 8;

        private PromotionRewardSummaryFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.PendingRewardTotals pendingRewardTotals = null;
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals completedRewardTotals = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.EarnedReward.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.RewardProgress.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    pendingRewardTotals = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.PendingRewardTotals) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.PendingRewardTotals.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    completedRewardTotals = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.CompletedRewardTotals.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment(list, list2, pendingRewardTotals, completedRewardTotals);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("earnedRewards");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.EarnedReward.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getEarnedRewards());
            writer.name("rewardProgress");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.RewardProgress.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getRewardProgress());
            writer.name("pendingRewardTotals");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.PendingRewardTotals.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPendingRewardTotals());
            writer.name("completedRewardTotals");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.CompletedRewardTotals.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCompletedRewardTotals());
        }
    }

    private PromotionRewardSummaryFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$EarnedReward;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$EarnedReward;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$EarnedReward;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$EarnedReward;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EarnedReward implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.EarnedReward INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.EarnedReward();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "pending", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION});
        public static final int $stable = 8;

        private EarnedReward() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardCurrency onPromotionOfferEarnedRewardCurrency;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints onPromotionOfferEarnedRewardPoints = null;
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PromotionOfferEarnedRewardCurrency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPromotionOfferEarnedRewardCurrency = com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardCurrency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPromotionOfferEarnedRewardCurrency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PromotionOfferEarnedRewardPoints"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPromotionOfferEarnedRewardPoints = com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardPoints.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints onPromotionOfferEarnedRewardPoints2 = onPromotionOfferEarnedRewardPoints;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (str2 != null) {
                    return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward(str, booleanValue, str2, onPromotionOfferEarnedRewardCurrency, onPromotionOfferEarnedRewardPoints2);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "pending");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.EarnedReward value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("pending");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPending()));
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            if (value.getOnPromotionOfferEarnedRewardCurrency() != null) {
                com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardCurrency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionOfferEarnedRewardCurrency());
            }
            if (value.getOnPromotionOfferEarnedRewardPoints() != null) {
                com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardPoints.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionOfferEarnedRewardPoints());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$OnPromotionOfferEarnedRewardCurrency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$OnPromotionOfferEarnedRewardCurrency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$OnPromotionOfferEarnedRewardCurrency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$OnPromotionOfferEarnedRewardCurrency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPromotionOfferEarnedRewardCurrency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardCurrency> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardCurrency INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardCurrency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("amount");
        public static final int $stable = 8;

        private OnPromotionOfferEarnedRewardCurrency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardCurrency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.Amount amount = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                amount = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.Amount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.Amount.INSTANCE, true).fromJson(reader, customScalarAdapters);
            }
            if (amount != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardCurrency(amount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "amount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardCurrency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.Amount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.Amount> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.Amount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$OnPromotionOfferEarnedRewardPoints;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$OnPromotionOfferEarnedRewardPoints;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$OnPromotionOfferEarnedRewardPoints;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$OnPromotionOfferEarnedRewardPoints;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPromotionOfferEarnedRewardPoints implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardPoints INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.OnPromotionOfferEarnedRewardPoints();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY);
        public static final int $stable = 8;

        private OnPromotionOfferEarnedRewardPoints() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.OnPromotionOfferEarnedRewardPoints value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPoints());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$RewardProgress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$RewardProgress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$RewardProgress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$RewardProgress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardProgress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.RewardProgress INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.RewardProgress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RewardProgress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragmentImpl_ResponseAdapter.PromotionRewardProgressItemFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.RewardProgress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragmentImpl_ResponseAdapter.PromotionRewardProgressItemFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPromotionRewardProgressItemFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$PendingRewardTotals;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$PendingRewardTotals;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$PendingRewardTotals;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$PendingRewardTotals;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PendingRewardTotals implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.PendingRewardTotals> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.PendingRewardTotals INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.PendingRewardTotals();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PendingRewardTotals() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.PendingRewardTotals fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.PromotionOfferEarnedRewardTotalsFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.PendingRewardTotals(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.PendingRewardTotals value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.PromotionOfferEarnedRewardTotalsFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPromotionOfferEarnedRewardTotalsFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragmentImpl_ResponseAdapter$CompletedRewardTotals;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$CompletedRewardTotals;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$CompletedRewardTotals;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment$CompletedRewardTotals;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompletedRewardTotals implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.CompletedRewardTotals INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragmentImpl_ResponseAdapter.CompletedRewardTotals();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CompletedRewardTotals() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.PromotionOfferEarnedRewardTotalsFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment.CompletedRewardTotals value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionOfferEarnedRewardTotalsFragmentImpl_ResponseAdapter.PromotionOfferEarnedRewardTotalsFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPromotionOfferEarnedRewardTotalsFragment());
        }
    }
}
