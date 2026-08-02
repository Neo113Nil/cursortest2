package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/Charity;", "toCharityList", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCharitiesQuery$Data;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CharityMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.Charity> toCharityList(com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Data data) {
        com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Page page;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> items;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Charities charities = data.getCharities();
        if (charities == null || (page = charities.getPage()) == null || (items = page.getItems()) == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item> list = items;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.shoppingrewards.graphql.GetCharitiesQuery.Item item : list) {
            java.lang.String id = item.getId();
            java.lang.String name2 = item.getName();
            java.lang.Object logoUrl = item.getLogoUrl();
            arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.Charity(id, name2, logoUrl instanceof java.lang.String ? (java.lang.String) logoUrl : null, item.isFavorite()));
        }
        return arrayList;
    }
}
