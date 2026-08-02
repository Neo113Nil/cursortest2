package com.paypal.oslo.feature.searchandintelligence.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/mapper/CommerceItemVariantMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$AgenticCommerceItemVariant;", "variants", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "mapToProductCards", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommerceItemVariantMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.data.mapper.CommerceItemVariantMapper INSTANCE = new com.paypal.oslo.feature.searchandintelligence.data.mapper.CommerceItemVariantMapper();

    private CommerceItemVariantMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> mapToProductCards(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> variants) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price;
        java.lang.Object logoUrl;
        java.lang.String flavor;
        java.lang.String size;
        java.lang.String color;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> customAttributes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variants, "");
        java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> list = variants;
        int i = 10;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant agenticCommerceItemVariant = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant) it.next();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem = agenticCommerceItemVariant.getCommerceItem();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store = commerceItem.getStore();
            java.lang.String id = commerceItem.getId();
            java.lang.Object primaryImageUrl = commerceItem.getPrimaryImageUrl();
            java.lang.String obj = primaryImageUrl != null ? primaryImageUrl.toString() : null;
            java.lang.String str = obj == null ? "" : obj;
            java.util.List<java.lang.Object> secondaryImageUrls = commerceItem.getSecondaryImageUrls();
            if (secondaryImageUrls != null) {
                java.util.List<java.lang.Object> list2 = secondaryImageUrls;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, i));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(it2.next().toString());
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String name2 = commerceItem.getName();
            java.lang.String str2 = name2 == null ? "" : name2;
            java.lang.String info = commerceItem.getInfo();
            java.lang.String str3 = info == null ? "" : info;
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice = commerceItem.getCurrentPrice();
            if (currentPrice == null) {
                price = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price("0", "USD");
            } else {
                price = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price(currentPrice.getValue(), currentPrice.getCurrencyCode().toString());
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice = commerceItem.getListPrice();
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price2 = listPrice != null ? new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price(listPrice.getValue(), listPrice.getCurrencyCode().toString()) : null;
            java.lang.String promotionalMessage = agenticCommerceItemVariant.getPromotionalMessage();
            java.lang.Object canonicalUrl = commerceItem.getCanonicalUrl();
            java.lang.String obj2 = canonicalUrl != null ? canonicalUrl.toString() : null;
            java.lang.String str4 = obj2 == null ? "" : obj2;
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details = agenticCommerceItemVariant.getDetails();
            if (details != null && (customAttributes = details.getCustomAttributes()) != null) {
                for (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute customAttribute : customAttributes) {
                    createMapBuilder.put(customAttribute.getName(), customAttribute.getValue());
                    it = it;
                }
            }
            java.util.Iterator it3 = it;
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details2 = agenticCommerceItemVariant.getDetails();
            if (details2 != null && (color = details2.getColor()) != null) {
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details3 = agenticCommerceItemVariant.getDetails();
            if (details3 != null && (size = details3.getSize()) != null) {
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details4 = agenticCommerceItemVariant.getDetails();
            if (details4 != null && (flavor = details4.getFlavor()) != null) {
                createMapBuilder.put("flavor", flavor);
            }
            arrayList2.add(new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard(id, str, arrayList, str2, str3, price, price2, promotionalMessage, str4, kotlin.collections.MapsKt.build(createMapBuilder), (java.util.List) null, store != null ? store.getId() : null, (store == null || (logoUrl = store.getLogoUrl()) == null) ? null : logoUrl.toString(), store != null ? store.getName() : null, 1024, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            it = it3;
            i = 10;
        }
        return arrayList2;
    }
}
