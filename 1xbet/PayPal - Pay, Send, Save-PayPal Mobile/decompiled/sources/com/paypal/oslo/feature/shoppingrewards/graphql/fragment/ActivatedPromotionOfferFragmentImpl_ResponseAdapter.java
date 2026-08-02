package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "ActivatedPromotionOfferFragment", "PresentmentAsset", "OnPromotionRewardsTabOfferCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivatedPromotionOfferFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragmentImpl_ResponseAdapter$ActivatedPromotionOfferFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivatedPromotionOfferFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.ActivatedPromotionOfferFragment INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.ActivatedPromotionOfferFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("presentmentAssets");
        public static final int $stable = 8;

        private ActivatedPromotionOfferFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("presentmentAssets");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getPresentmentAssets());
        }
    }

    private ActivatedPromotionOfferFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragmentImpl_ResponseAdapter$PresentmentAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment$PresentmentAsset;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment$PresentmentAsset;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment$PresentmentAsset;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PresentmentAsset implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.PresentmentAsset> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.PresentmentAsset INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.PresentmentAsset();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PresentmentAsset() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.PresentmentAsset fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.OnPromotionRewardsTabOfferCard onPromotionRewardsTabOfferCard = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PromotionRewardsTabOfferCard"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPromotionRewardsTabOfferCard = com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.OnPromotionRewardsTabOfferCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.PresentmentAsset(str, onPromotionRewardsTabOfferCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.PresentmentAsset value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPromotionRewardsTabOfferCard() != null) {
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.OnPromotionRewardsTabOfferCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionRewardsTabOfferCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragmentImpl_ResponseAdapter$OnPromotionRewardsTabOfferCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment$OnPromotionRewardsTabOfferCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ActivatedPromotionOfferFragment$OnPromotionRewardsTabOfferCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPromotionRewardsTabOfferCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.OnPromotionRewardsTabOfferCard> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.OnPromotionRewardsTabOfferCard INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragmentImpl_ResponseAdapter.OnPromotionRewardsTabOfferCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"activatedTitleText", "activatedDescriptionText", "activatedImageUrl", "activatedProgressBarType", "navigationType"});
        public static final int $stable = 8;

        private OnPromotionRewardsTabOfferCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.OnPromotionRewardsTabOfferCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType = null;
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType promotionsOfferPresentmentNavigationType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    promotionsOfferPresentmentProgressBarType = (com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentProgressBarType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    promotionsOfferPresentmentNavigationType = (com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentNavigationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "activatedTitleText");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "activatedDescriptionText");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.OnPromotionRewardsTabOfferCard(str, str2, obj, promotionsOfferPresentmentProgressBarType, promotionsOfferPresentmentNavigationType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "activatedImageUrl");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ActivatedPromotionOfferFragment.OnPromotionRewardsTabOfferCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("activatedTitleText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getActivatedTitleText());
            writer.name("activatedDescriptionText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getActivatedDescriptionText());
            writer.name("activatedImageUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getActivatedImageUrl());
            writer.name("activatedProgressBarType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentProgressBarType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getActivatedProgressBarType());
            writer.name("navigationType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentNavigationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getNavigationType());
        }
    }
}
