package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "InviteFriendFragment", "PresentmentAsset", "OnPromotionSingleCtaOfferCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InviteFriendFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragmentImpl_ResponseAdapter$InviteFriendFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InviteFriendFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.InviteFriendFragment INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.InviteFriendFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("presentmentAssets");
        public static final int $stable = 8;

        private InviteFriendFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("presentmentAssets");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getPresentmentAssets());
        }
    }

    private InviteFriendFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragmentImpl_ResponseAdapter$PresentmentAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$PresentmentAsset;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$PresentmentAsset;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$PresentmentAsset;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PresentmentAsset implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.PresentmentAsset INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.PresentmentAsset();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PresentmentAsset() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard onPromotionSingleCtaOfferCard = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PromotionSingleCtaOfferCard"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPromotionSingleCtaOfferCard = com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.OnPromotionSingleCtaOfferCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset(str, onPromotionSingleCtaOfferCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.PresentmentAsset value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPromotionSingleCtaOfferCard() != null) {
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.OnPromotionSingleCtaOfferCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionSingleCtaOfferCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragmentImpl_ResponseAdapter$OnPromotionSingleCtaOfferCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/InviteFriendFragment$OnPromotionSingleCtaOfferCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPromotionSingleCtaOfferCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.OnPromotionSingleCtaOfferCard INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragmentImpl_ResponseAdapter.OnPromotionSingleCtaOfferCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"localeCode", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "cardImageUrl", "ctaText", "termsText", "navigationType"});
        public static final int $stable = 8;

        private OnPromotionSingleCtaOfferCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            if (r7 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard(r2, r3, r4, r5, r6, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "termsText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "ctaText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "cardImageUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "title");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "localeCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r4 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r5 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r6 == null) goto L22;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType promotionsOfferPresentmentNavigationType = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        promotionsOfferPresentmentNavigationType = (com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentNavigationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentNavigationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.InviteFriendFragment.OnPromotionSingleCtaOfferCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("localeCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getLocaleCode());
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            writer.name("cardImageUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCardImageUrl());
            writer.name("ctaText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getCtaText());
            writer.name("termsText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTermsText());
            writer.name("navigationType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentNavigationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getNavigationType());
        }
    }
}
