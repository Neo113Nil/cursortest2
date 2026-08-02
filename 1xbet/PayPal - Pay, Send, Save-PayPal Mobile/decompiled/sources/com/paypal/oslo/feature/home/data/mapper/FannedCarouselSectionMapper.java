package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/data/mapper/FannedCarouselSectionMapper;", "Lcom/paypal/oslo/feature/home/data/mapper/SectionMapper;", "Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "<init>", "()V", "", "sectionId", "", "sectionPosition", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "shoppingCollection", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "personalizationTrackingId", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "map", "(Ljava/lang/String;ILcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;Lcom/paypal/oslo/feature/home/domain/StringProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FannedCarouselSectionMapper implements com.paypal.oslo.feature.home.data.mapper.SectionMapper<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.data.mapper.FannedCarouselSectionMapper INSTANCE = new com.paypal.oslo.feature.home.data.mapper.FannedCarouselSectionMapper();

    private FannedCarouselSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.home.data.mapper.SectionMapper
    public final com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData> map(java.lang.String sectionId, int sectionPosition, com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, com.paypal.oslo.feature.home.domain.StringProvider stringProvider, java.lang.String personalizationTrackingId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore> filterValidStores = com.paypal.oslo.feature.home.data.mapper.StoreExtensionsKt.filterValidStores(shoppingCollection);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(filterValidStores, 10));
        java.util.Iterator<T> it = filterValidStores.iterator();
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
            java.lang.Object logoBgColor = onStore.getLogoBgColor();
            java.lang.String normalizeHexColor = com.paypal.oslo.feature.home.data.mapper.ColorUtilsKt.normalizeHexColor(logoBgColor instanceof java.lang.String ? (java.lang.String) logoBgColor : null);
            java.lang.String primaryQualifier = com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getPrimaryQualifier(onStore);
            java.lang.String id = onStore.getId();
            java.lang.Object logoUrl = onStore.getLogoUrl();
            java.lang.String obj = logoUrl != null ? logoUrl.toString() : null;
            arrayList.add(new com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData(id, obj == null ? "" : obj, onStore.getName(), primaryQualifier, normalizeHexColor, null, onStore.getUrl().toString(), com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitTypes(onStore), com.paypal.oslo.feature.home.data.mapper.QualifierExtensionsKt.getBenefitsMetadata(onStore), new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("fanned_card", new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(onStore.getId(), onStore.getName()), i)));
            i++;
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String title = shoppingCollection.getTitle();
        java.lang.String exploreMoreButtonText = stringProvider.getExploreMoreButtonText();
        com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[] analyticsContextArr = new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[2];
        analyticsContextArr[0] = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.HOME_FEED, "collection", "view");
        analyticsContextArr[1] = personalizationTrackingId != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.PIE, personalizationTrackingId) : null;
        return new com.paypal.oslo.feature.home.domain.model.Section<>(sectionId, com.paypal.oslo.feature.home.domain.model.SectionTypes.FANNED_CAROUSEL, title, (java.lang.String) null, arrayList2, exploreMoreButtonText, (java.lang.String) null, new com.paypal.oslo.feature.home.domain.model.SectionInstrumentation("fanned_collection", sectionPosition, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) analyticsContextArr)), 72, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
