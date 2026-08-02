package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/data/mapper/DeckCardSectionMapper;", "Lcom/paypal/oslo/feature/home/data/mapper/SectionMapper;", "Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "<init>", "()V", "", "sectionId", "", "sectionPosition", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "shoppingCollection", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "personalizationTrackingId", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "map", "(Ljava/lang/String;ILcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;Lcom/paypal/oslo/feature/home/domain/StringProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeckCardSectionMapper implements com.paypal.oslo.feature.home.data.mapper.SectionMapper<com.paypal.oslo.feature.home.domain.model.DeckCardContent> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.data.mapper.DeckCardSectionMapper INSTANCE = new com.paypal.oslo.feature.home.data.mapper.DeckCardSectionMapper();

    private DeckCardSectionMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    @Override // com.paypal.oslo.feature.home.data.mapper.SectionMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.DeckCardContent> map(java.lang.String sectionId, int sectionPosition, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, java.lang.String personalizationTrackingId) {
        java.lang.String str;
        java.lang.String tagline;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        java.util.List take = kotlin.collections.CollectionsKt.take(com.paypal.oslo.feature.home.data.mapper.StoreExtensionsKt.filterValidStores(shoppingCollection), 3);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(take, 10));
        java.util.Iterator it = take.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore) next;
            java.lang.String id = onStore.getId();
            java.lang.String findLifestyleLogoUrl = com.paypal.oslo.feature.home.data.mapper.StoreExtensionsKt.findLifestyleLogoUrl(onStore, com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType.HERO, com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType.CAROUSEL);
            if (findLifestyleLogoUrl == null) {
                java.lang.Object logoUrl = onStore.getLogoUrl();
                findLifestyleLogoUrl = logoUrl != null ? logoUrl.toString() : null;
                if (findLifestyleLogoUrl == null) {
                    str = "";
                    java.lang.String name2 = onStore.getName();
                    java.lang.String obj = onStore.getUrl().toString();
                    java.lang.Object logoUrl2 = onStore.getLogoUrl();
                    java.lang.String obj2 = logoUrl2 != null ? logoUrl2.toString() : null;
                    java.lang.String str2 = obj2 != null ? "" : obj2;
                    java.lang.String shopButtonText = stringProvider.getShopButtonText();
                    tagline = onStore.getTagline();
                    if (tagline != null) {
                        tagline = onStore.getName();
                    }
                    arrayList.add(new com.paypal.oslo.feature.home.domain.model.DeckCardContent(id, tagline, null, str, com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getPrimaryQualifier(onStore), name2, str2, shopButtonText, "", obj, com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitTypes(onStore), com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitsMetadata(onStore), new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("deck_card", new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(onStore.getId(), onStore.getName()), i), 4, null));
                    i++;
                }
            }
            str = findLifestyleLogoUrl;
            java.lang.String name22 = onStore.getName();
            java.lang.String obj3 = onStore.getUrl().toString();
            java.lang.Object logoUrl22 = onStore.getLogoUrl();
            if (logoUrl22 != null) {
            }
            if (obj2 != null) {
            }
            java.lang.String shopButtonText2 = stringProvider.getShopButtonText();
            tagline = onStore.getTagline();
            if (tagline != null) {
            }
            arrayList.add(new com.paypal.oslo.feature.home.domain.model.DeckCardContent(id, tagline, null, str, com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getPrimaryQualifier(onStore), name22, str2, shopButtonText2, "", obj3, com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitTypes(onStore), com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitsMetadata(onStore), new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("deck_card", new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(onStore.getId(), onStore.getName()), i), 4, null));
            i++;
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String title = shoppingCollection.getTitle();
        java.lang.String exploreMoreButtonText = stringProvider.getExploreMoreButtonText();
        com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[] analyticsContextArr = new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[2];
        analyticsContextArr[0] = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.HOME_FEED, "collection", "view");
        analyticsContextArr[1] = personalizationTrackingId != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.PIE, personalizationTrackingId) : null;
        return new com.paypal.oslo.feature.home.domain.model.Section<>(sectionId, com.paypal.oslo.feature.home.domain.model.SectionTypes.DECK_CARD, title, (java.lang.String) null, arrayList2, exploreMoreButtonText, (java.lang.String) null, new com.paypal.oslo.feature.home.domain.model.SectionInstrumentation("deck_collection", sectionPosition, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) analyticsContextArr)), 72, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
