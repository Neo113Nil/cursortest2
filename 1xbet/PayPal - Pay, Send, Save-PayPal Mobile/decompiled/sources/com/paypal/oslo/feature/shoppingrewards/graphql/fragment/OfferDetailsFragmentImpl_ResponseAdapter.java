package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "OfferDetailsFragment", "PresentmentAsset", "OnPromotionOfferEducationHalfSheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OfferDetailsFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragmentImpl_ResponseAdapter$OfferDetailsFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OfferDetailsFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.OfferDetailsFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("presentmentAssets");
        public static final int $stable = 8;

        private OfferDetailsFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("presentmentAssets");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.PresentmentAsset.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getPresentmentAssets());
        }
    }

    private OfferDetailsFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragmentImpl_ResponseAdapter$PresentmentAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$PresentmentAsset;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$PresentmentAsset;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$PresentmentAsset;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PresentmentAsset implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.PresentmentAsset INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.PresentmentAsset();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PresentmentAsset() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PromotionOfferEducationHalfSheet"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPromotionOfferEducationHalfSheet = com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.OnPromotionOfferEducationHalfSheet.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset(str, onPromotionOfferEducationHalfSheet);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.PresentmentAsset value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPromotionOfferEducationHalfSheet() != null) {
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.OnPromotionOfferEducationHalfSheet.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionOfferEducationHalfSheet());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragmentImpl_ResponseAdapter$OnPromotionOfferEducationHalfSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/OfferDetailsFragment$OnPromotionOfferEducationHalfSheet;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPromotionOfferEducationHalfSheet implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet> {
        public static final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.OnPromotionOfferEducationHalfSheet INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragmentImpl_ResponseAdapter.OnPromotionOfferEducationHalfSheet();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"title", "subtitle", "detailsText", "detailsIcons", "termsText", "termsUrl", "termsUrls", "eligibleCtaText", "activatedCtaText", "activatedCtaUrl", "activatedProgressBarType", "merchantLogoUrl"});
        public static final int $stable = 8;

        private OnPromotionOfferEducationHalfSheet() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00b7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "termsUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00c1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00c2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "termsText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00cc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00cd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "detailsIcons");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "detailsText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "title");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r4 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r6 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            if (r7 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r8 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        
            if (r9 == null) goto L24;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.util.List list = null;
            java.util.List list2 = null;
            java.lang.String str3 = null;
            java.lang.Object obj = null;
            java.util.List list3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType promotionsOfferPresentmentProgressBarType = null;
            java.lang.Object obj3 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list3 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        promotionsOfferPresentmentProgressBarType = (com.paypal.oslo.api.graphql.schema.type.PromotionsOfferPresentmentProgressBarType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentProgressBarType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.OfferDetailsFragment.OnPromotionOfferEducationHalfSheet value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("title");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTitle());
            writer.name("subtitle");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.name("detailsText");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getDetailsText());
            writer.name("detailsIcons");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getDetailsIcons());
            writer.name("termsText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTermsText());
            writer.name("termsUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getTermsUrl());
            writer.name("termsUrls");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.AnyAdapter)).toJson(writer, customScalarAdapters, value.getTermsUrls());
            writer.name("eligibleCtaText");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getEligibleCtaText());
            writer.name("activatedCtaText");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getActivatedCtaText());
            writer.name("activatedCtaUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getActivatedCtaUrl());
            writer.name("activatedProgressBarType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PromotionsOfferPresentmentProgressBarType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getActivatedProgressBarType());
            writer.name("merchantLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getMerchantLogoUrl());
        }
    }
}
