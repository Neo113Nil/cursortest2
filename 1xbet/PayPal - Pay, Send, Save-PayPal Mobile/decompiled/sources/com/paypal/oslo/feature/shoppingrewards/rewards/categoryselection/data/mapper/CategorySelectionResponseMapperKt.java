package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;", "toCategorySelectionResponse", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetCategorySelectionQuery$Data;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategorySelectionResponse;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategorySelectionResponseMapperKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r5.equals("restaurants") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        r4 = com.paypal.pds.core.Icon.Cutlery.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (r5.equals("rideshare") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        r4 = com.paypal.pds.core.Icon.Car.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (r5.equals("rideshare & transit") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        if (r5.equals(com.google.android.libraries.places.api.model.PlaceTypes.RESTAURANT) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse toCategorySelectionResponse(com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Data data) {
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment categorySelectionPresentmentFragment;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> presentmentAssets;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset presentmentAsset;
        java.lang.Object obj;
        java.lang.String str;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategoryConfirmationData categoryConfirmationData;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset presentmentAsset2;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset presentmentAsset3;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer2;
        java.lang.Object obj2;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset presentmentAsset4;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer3;
        com.paypal.pds.core.Icon.NoIcon noIcon;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> items = data.getPromotionOffers().getItems();
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item> list = items;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            java.lang.String str2 = null;
            r5 = null;
            r5 = null;
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.Category category = null;
            if (!it.hasNext()) {
                java.util.ArrayList arrayList2 = arrayList;
                if (items.isEmpty() || arrayList2.isEmpty()) {
                    return null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategoryConfirmationData categoryConfirmationData2 = null;
                for (com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item item : list) {
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> userEnrollments = item.getUserEnrollments();
                    if (userEnrollments != null) {
                        java.util.Iterator<T> it2 = userEnrollments.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (((com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment) obj2).getStatus() == com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.ENABLED) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment userEnrollment = (com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment) obj2;
                        if (userEnrollment != null) {
                            obj = userEnrollment.getExpiryTime();
                            str = !(obj instanceof java.lang.String) ? (java.lang.String) obj : null;
                            if (str != null && categoryConfirmationData2 == null) {
                                java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets2 = item.getCategoryDetailsPresentmentFragment().getPresentmentAssets();
                                categoryConfirmationData2 = (presentmentAssets2 != null || (presentmentAsset3 = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets2)) == null || (onRewardsCategoryOffer2 = presentmentAsset3.getOnRewardsCategoryOffer()) == null) ? null : com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.mapper.CategoryConfirmationMapperKt.toCategoryConfirmationData(onRewardsCategoryOffer2, str);
                            }
                            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets3 = item.getCategoryDetailsPresentmentFragment().getPresentmentAssets();
                            categoryConfirmationData = (presentmentAssets3 != null || (presentmentAsset2 = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets3)) == null || (onRewardsCategoryOffer = presentmentAsset2.getOnRewardsCategoryOffer()) == null) ? null : com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.mapper.CategoryConfirmationMapperKt.toCategoryConfirmationData(onRewardsCategoryOffer, str);
                            if (categoryConfirmationData == null) {
                                arrayList3.add(categoryConfirmationData);
                            }
                        }
                    }
                    obj = null;
                    if (!(obj instanceof java.lang.String)) {
                    }
                    if (str != null) {
                        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets22 = item.getCategoryDetailsPresentmentFragment().getPresentmentAssets();
                        if (presentmentAssets22 != null) {
                        }
                    }
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets32 = item.getCategoryDetailsPresentmentFragment().getPresentmentAssets();
                    if (presentmentAssets32 != null) {
                    }
                    if (categoryConfirmationData == null) {
                    }
                }
                java.util.ArrayList arrayList4 = arrayList3;
                com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item item2 = (com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) items);
                com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer4 = (item2 == null || (categorySelectionPresentmentFragment = item2.getCategorySelectionPresentmentFragment()) == null || (presentmentAssets = categorySelectionPresentmentFragment.getPresentmentAssets()) == null || (presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets)) == null) ? null : presentmentAsset.getOnRewardsCategoryOffer();
                java.lang.String offerDetailsTermsText = onRewardsCategoryOffer4 != null ? onRewardsCategoryOffer4.getOfferDetailsTermsText() : null;
                java.lang.Object offerDetailsTermsUrl = onRewardsCategoryOffer4 != null ? onRewardsCategoryOffer4.getOfferDetailsTermsUrl() : null;
                return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategorySelectionResponse(arrayList2, arrayList4, categoryConfirmationData2, offerDetailsTermsText, offerDetailsTermsUrl instanceof java.lang.String ? (java.lang.String) offerDetailsTermsUrl : null);
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item item3 = (com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.Item) it.next();
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> userEnrollments2 = item3.getUserEnrollments();
            boolean z = false;
            if (userEnrollments2 != null) {
                java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment> list2 = userEnrollments2;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((com.paypal.oslo.feature.shoppingrewards.graphql.GetCategorySelectionQuery.UserEnrollment) it3.next()).getStatus() == com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus.ENABLED) {
                                z = true;
                            }
                        }
                    }
                }
            }
            boolean z2 = z;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset> presentmentAssets4 = item3.getCategorySelectionPresentmentFragment().getPresentmentAssets();
            if (presentmentAssets4 != null && (presentmentAsset4 = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategorySelectionPresentmentFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets4)) != null && (onRewardsCategoryOffer3 = presentmentAsset4.getOnRewardsCategoryOffer()) != null) {
                java.lang.String id = item3.getId();
                java.lang.String cardCategoryName = onRewardsCategoryOffer3.getCardCategoryName();
                java.lang.String obj3 = kotlin.text.StringsKt.trim(onRewardsCategoryOffer3.getCardCategoryDescription()).toString();
                java.lang.String cardCategoryName2 = onRewardsCategoryOffer3.getCardCategoryName();
                if (cardCategoryName2 != null) {
                    str2 = cardCategoryName2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                }
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2007578005:
                            if (str2.equals("groceries")) {
                                noIcon = com.paypal.pds.core.Icon.Cart.INSTANCE;
                                break;
                            }
                            break;
                        case -1772467395:
                            break;
                        case -1457193760:
                            break;
                        case -793554375:
                            if (str2.equals("apparel")) {
                                noIcon = com.paypal.pds.core.Icon.Shirt.INSTANCE;
                                break;
                            }
                            break;
                        case -22887961:
                            break;
                        case 3154358:
                            if (str2.equals("fuel")) {
                                noIcon = com.paypal.pds.core.Icon.GasPump.INSTANCE;
                                break;
                            }
                            break;
                        case 888085718:
                            break;
                    }
                    category = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.Category(id, cardCategoryName, obj3, noIcon, false, z2);
                }
                noIcon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                category = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.Category(id, cardCategoryName, obj3, noIcon, false, z2);
            }
            if (category != null) {
                arrayList.add(category);
            }
        }
    }
}
