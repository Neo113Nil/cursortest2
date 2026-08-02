package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "CategoryDetailsPresentmentFragment", "PresentmentAsset", "OnRewardsCategoryOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CategoryDetailsPresentmentFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragmentImpl_ResponseAdapter$CategoryDetailsPresentmentFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CategoryDetailsPresentmentFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.CategoryDetailsPresentmentFragment INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.CategoryDetailsPresentmentFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("presentmentAssets");
        public static final int $stable = 8;

        private CategoryDetailsPresentmentFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("presentmentAssets");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getPresentmentAssets());
        }
    }

    private CategoryDetailsPresentmentFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragmentImpl_ResponseAdapter$PresentmentAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$PresentmentAsset;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$PresentmentAsset;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$PresentmentAsset;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PresentmentAsset implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.PresentmentAsset INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.PresentmentAsset();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PresentmentAsset() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RewardsCategoryOffer"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRewardsCategoryOffer = com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.OnRewardsCategoryOffer.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset(str, onRewardsCategoryOffer);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRewardsCategoryOffer() != null) {
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.OnRewardsCategoryOffer.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRewardsCategoryOffer());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragmentImpl_ResponseAdapter$OnRewardsCategoryOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRewardsCategoryOffer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.OnRewardsCategoryOffer INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragmentImpl_ResponseAdapter.OnRewardsCategoryOffer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"offerDetailsHeroImageUrl", "offerDetailsOfferTitleText", "offerDetailsExpirationText", "offerDetailsPpuiTokens", "offerDetailsTexts", "offerDetailsSubtexts", "offerDetailsTermsText", "offerDetailsTermsUrl", "offerDetailsCtaText"});
        public static final int $stable = 8;

        private OnRewardsCategoryOffer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r7 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            if (r8 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if (r9 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r10 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsCtaText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsTermsUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsTermsText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsSubtexts");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsTexts");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsPpuiTokens");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsExpirationText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsOfferTitleText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "offerDetailsHeroImageUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r2 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r3 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (r4 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r5 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            if (r6 == null) goto L33;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.util.List list = null;
            java.util.List list2 = null;
            java.util.List list3 = null;
            java.lang.String str3 = null;
            java.lang.Object obj2 = null;
            java.lang.String str4 = null;
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
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        list3 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("offerDetailsHeroImageUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getOfferDetailsHeroImageUrl());
            writer.name("offerDetailsOfferTitleText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getOfferDetailsOfferTitleText());
            writer.name("offerDetailsExpirationText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getOfferDetailsExpirationText());
            writer.name("offerDetailsPpuiTokens");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getOfferDetailsPpuiTokens());
            writer.name("offerDetailsTexts");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getOfferDetailsTexts());
            writer.name("offerDetailsSubtexts");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getOfferDetailsSubtexts());
            writer.name("offerDetailsTermsText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getOfferDetailsTermsText());
            writer.name("offerDetailsTermsUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getOfferDetailsTermsUrl());
            writer.name("offerDetailsCtaText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getOfferDetailsCtaText());
        }
    }
}
