package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/data/mapper/LargeTileSectionMapper;", "Lcom/paypal/oslo/feature/home/data/mapper/SectionMapper;", "Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "<init>", "()V", "", "sectionId", "", "sectionPosition", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "shoppingCollection", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "personalizationTrackingId", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "map", "(Ljava/lang/String;ILcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;Lcom/paypal/oslo/feature/home/domain/StringProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LargeTileSectionMapper implements com.paypal.oslo.feature.home.data.mapper.SectionMapper<com.paypal.oslo.feature.home.domain.model.LargeTileContent> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.data.mapper.LargeTileSectionMapper INSTANCE = new com.paypal.oslo.feature.home.data.mapper.LargeTileSectionMapper();

    private LargeTileSectionMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    @Override // com.paypal.oslo.feature.home.data.mapper.SectionMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.LargeTileContent> map(java.lang.String sectionId, int sectionPosition, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, java.lang.String personalizationTrackingId) {
        java.lang.String str;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection = shoppingCollection.getOnStoreShoppingCollection();
        java.lang.String description = onStoreShoppingCollection != null ? onStoreShoppingCollection.getDescription() : null;
        if (description == null) {
            description = "";
        }
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore> filterValidStores = com.paypal.oslo.feature.home.data.mapper.StoreExtensionsKt.filterValidStores(shoppingCollection);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(filterValidStores, 10));
        int i = 0;
        for (java.lang.Object obj : filterValidStores) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore) obj;
            java.lang.String findLifestyleLogoUrl = com.paypal.oslo.feature.home.data.mapper.StoreExtensionsKt.findLifestyleLogoUrl(onStore, com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType.CAROUSEL, com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType.HERO);
            java.lang.String combinedQualifier = com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getCombinedQualifier(onStore);
            java.lang.String id = onStore.getId();
            java.lang.String name2 = onStore.getName();
            if (findLifestyleLogoUrl == null) {
                java.lang.Object logoUrl = onStore.getLogoUrl();
                findLifestyleLogoUrl = logoUrl != null ? logoUrl.toString() : null;
                if (findLifestyleLogoUrl == null) {
                    str = str2;
                    java.lang.Object logoUrl2 = onStore.getLogoUrl();
                    java.lang.String obj2 = logoUrl2 == null ? logoUrl2.toString() : null;
                    java.lang.String shopButtonText = stringProvider.getShopButtonText();
                    java.lang.String obj3 = onStore.getUrl().toString();
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes = com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitTypes(onStore);
                    com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitsMetadata(onStore);
                    com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("splash_card", new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(onStore.getId(), onStore.getName()), i);
                    int i2 = i;
                    java.lang.String str3 = str;
                    java.lang.String str4 = str2;
                    java.util.ArrayList arrayList2 = arrayList;
                    arrayList2.add(new com.paypal.oslo.feature.home.domain.model.LargeTileContent(id, name2, combinedQualifier, description, str3, obj2, shopButtonText, null, false, false, null, null, null, null, null, obj3, benefitTypes, benefitsMetadata, tileInstrumentation, 32640, null));
                    i = i2 + 1;
                    arrayList = arrayList2;
                    str2 = str4;
                }
            }
            str = findLifestyleLogoUrl;
            java.lang.Object logoUrl22 = onStore.getLogoUrl();
            if (logoUrl22 == null) {
            }
            java.lang.String shopButtonText2 = stringProvider.getShopButtonText();
            java.lang.String obj32 = onStore.getUrl().toString();
            java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes2 = com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitTypes(onStore);
            com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2 = com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitsMetadata(onStore);
            com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation2 = new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("splash_card", new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(onStore.getId(), onStore.getName()), i);
            int i22 = i;
            java.lang.String str32 = str;
            java.lang.String str42 = str2;
            java.util.ArrayList arrayList22 = arrayList;
            arrayList22.add(new com.paypal.oslo.feature.home.domain.model.LargeTileContent(id, name2, combinedQualifier, description, str32, obj2, shopButtonText2, null, false, false, null, null, null, null, null, obj32, benefitTypes2, benefitsMetadata2, tileInstrumentation2, 32640, null));
            i = i22 + 1;
            arrayList = arrayList22;
            str2 = str42;
        }
        java.util.ArrayList arrayList3 = arrayList;
        java.lang.String title = shoppingCollection.getTitle();
        java.lang.String exploreMoreButtonText = stringProvider.getExploreMoreButtonText();
        com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[] analyticsContextArr = new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[2];
        analyticsContextArr[0] = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.HOME_FEED, "collection", "view");
        analyticsContextArr[1] = personalizationTrackingId != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.PIE, personalizationTrackingId) : null;
        return new com.paypal.oslo.feature.home.domain.model.Section<>(sectionId, com.paypal.oslo.feature.home.domain.model.SectionTypes.LARGE_TILE, title, (java.lang.String) null, arrayList3, exploreMoreButtonText, (java.lang.String) null, new com.paypal.oslo.feature.home.domain.model.SectionInstrumentation("splash_collection", sectionPosition, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) analyticsContextArr)), 72, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
