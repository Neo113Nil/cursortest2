package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetStoreInfoQuery$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "storeInfoDataMapper", "Lkotlin/jvm/functions/Function1;", "getStoreInfoDataMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StoreInfoMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Data, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> storeInfoDataMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.StoreInfoMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.StoreInfoMapperKt.$r8$lambda$7tMKszt8U3YEBMY2GRJXvUBYDCY((com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Data, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails> getStoreInfoDataMapper() {
        return storeInfoDataMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails $r8$lambda$7tMKszt8U3YEBMY2GRJXvUBYDCY(com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Data data) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation promotionOfferEducation;
        java.util.Iterator<T> it;
        java.lang.Object obj;
        java.util.Iterator<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.BnplConfig> it2;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Product> products;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Offer> offers;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.OnPromotionOfferEducationHalfSheet onPromotionOfferEducationHalfSheet;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Reward reward;
        java.lang.Integer points;
        com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Reward reward2;
        java.lang.Object percentage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data.getStores().getItems());
        if (item == null) {
            return null;
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Item1 item1 = (com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Item1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) item.getMerchantOffers().getItems());
        java.lang.String obj2 = (item1 == null || (reward2 = item1.getReward()) == null || (percentage = reward2.getPercentage()) == null) ? null : percentage.toString();
        java.lang.String valueOf = (item1 == null || (reward = item1.getReward()) == null || (points = reward.getPoints()) == null) ? null : java.lang.String.valueOf(points.intValue());
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.PresentmentAsset> presentmentAssets = item1 != null ? item1.getPresentmentAssets() : null;
        if (presentmentAssets != null) {
            java.util.Iterator<T> it3 = presentmentAssets.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    onPromotionOfferEducationHalfSheet = null;
                    break;
                }
                onPromotionOfferEducationHalfSheet = ((com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.PresentmentAsset) it3.next()).getOnPromotionOfferEducationHalfSheet();
                if (onPromotionOfferEducationHalfSheet != null) {
                    break;
                }
            }
            if (onPromotionOfferEducationHalfSheet != null) {
                java.lang.String title = onPromotionOfferEducationHalfSheet.getTitle();
                java.util.List<java.lang.Object> termsUrls = onPromotionOfferEducationHalfSheet.getTermsUrls();
                if (termsUrls != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : termsUrls) {
                        if (obj3 instanceof java.lang.String) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                java.lang.String termsText = onPromotionOfferEducationHalfSheet.getTermsText();
                java.util.List<java.lang.String> detailsIcons = onPromotionOfferEducationHalfSheet.getDetailsIcons();
                if (detailsIcons != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : detailsIcons) {
                        if (obj4 instanceof java.lang.String) {
                            arrayList5.add(obj4);
                        }
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                java.util.List<java.lang.String> detailsText = onPromotionOfferEducationHalfSheet.getDetailsText();
                if (detailsText != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : detailsText) {
                        if (obj5 instanceof java.lang.String) {
                            arrayList6.add(obj5);
                        }
                    }
                    arrayList3 = arrayList6;
                } else {
                    arrayList3 = null;
                }
                promotionOfferEducation = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation(title, arrayList, termsText, arrayList2, arrayList3);
                java.lang.String id = item.getId();
                java.lang.String id2 = item1 == null ? item1.getId() : null;
                java.lang.String obj6 = item.getUrl().toString();
                java.lang.String name2 = item.getName();
                java.lang.String affiliateRestrictions = item.getAffiliateRestrictions();
                it = item.getMerchantIdentities().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.MerchantIdentity) obj).getSecureId() != null) {
                        break;
                    }
                }
                com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.MerchantIdentity merchantIdentity = (com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.MerchantIdentity) obj;
                java.lang.String secureId = merchantIdentity == null ? merchantIdentity.getSecureId() : null;
                java.lang.Object logoUrl = item.getLogoUrl();
                java.lang.String obj7 = logoUrl == null ? logoUrl.toString() : null;
                com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata(obj2, valueOf);
                java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.BnplConfig> bnplConfig = item.getBnplConfig();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                it2 = bnplConfig.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.BnplMetadata bnplMetadata = it2.next().getBnplMetadata();
                    if (bnplMetadata != null && (products = bnplMetadata.getProducts()) != null) {
                        for (com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Product product : products) {
                            com.paypal.oslo.api.graphql.schema.type.BNPLProductType productType = product.getProductType();
                            if (productType != null && (offers = product.getOffers()) != null) {
                                for (com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.Offer offer : offers) {
                                    com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType = (productType == com.paypal.oslo.api.graphql.schema.type.BNPLProductType.PAY_LATER_LONG_TERM && offer.getInterestFreeLoanStatus() == com.paypal.oslo.api.graphql.schema.type.BNPLInterestFreeLoanStatusType.LIVE && kotlin.jvm.internal.Intrinsics.areEqual(offer.isInterestFreeLoan(), java.lang.Boolean.TRUE)) ? com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR : productType == com.paypal.oslo.api.graphql.schema.type.BNPLProductType.PAY_LATER_LONG_TERM ? com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY : productType == com.paypal.oslo.api.graphql.schema.type.BNPLProductType.PAY_LATER ? com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4 : null;
                                    if (benefitType != null) {
                                        java.lang.Object obj8 = linkedHashMap.get(benefitType);
                                        if (obj8 == null) {
                                            obj8 = (java.util.List) new java.util.ArrayList();
                                            linkedHashMap.put(benefitType, obj8);
                                        }
                                        ((java.util.List) obj8).add(new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer(offer.getTerm(), offer.getMinAmount(), offer.getMaxAmount()));
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.util.Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        java.lang.Integer num = ((com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer) it4.next()).getHighSpeedVideoFpsRangesFor;
                        if (num != null) {
                            arrayList7.add(num);
                        }
                    }
                    java.util.List sorted = kotlin.collections.CollectionsKt.sorted(arrayList7);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sorted, 10));
                    java.util.Iterator it5 = sorted.iterator();
                    while (it5.hasNext()) {
                        arrayList8.add(java.lang.String.valueOf(((java.lang.Number) it5.next()).intValue()));
                    }
                    java.util.ArrayList arrayList9 = arrayList8;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str = ((com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer) it6.next()).getHighSpeedVideoSizes;
                        java.math.BigDecimal bigDecimalOrNull = str != null ? kotlin.text.StringsKt.toBigDecimalOrNull(str) : null;
                        if (bigDecimalOrNull != null) {
                            arrayList10.add(bigDecimalOrNull);
                        }
                    }
                    java.math.BigDecimal bigDecimal = (java.math.BigDecimal) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList10);
                    java.lang.String valueOf2 = bigDecimal != null ? java.lang.String.valueOf(bigDecimal.longValue()) : null;
                    if (valueOf2 == null) {
                        valueOf2 = "";
                    }
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    java.util.Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        java.lang.String str2 = ((com.paypal.oslo.feature.shoppingrewards.shopping.common.data.mapper.RawOffer) it7.next()).getHighSpeedVideoFpsRanges;
                        java.math.BigDecimal bigDecimalOrNull2 = str2 != null ? kotlin.text.StringsKt.toBigDecimalOrNull(str2) : null;
                        if (bigDecimalOrNull2 != null) {
                            arrayList11.add(bigDecimalOrNull2);
                        }
                    }
                    java.math.BigDecimal bigDecimal2 = (java.math.BigDecimal) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList11);
                    java.lang.String valueOf3 = bigDecimal2 != null ? java.lang.String.valueOf(bigDecimal2.longValue()) : null;
                    if (valueOf3 == null) {
                        valueOf3 = "";
                    }
                    linkedHashMap2.put(key, new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata(arrayList9, valueOf2, valueOf3));
                }
                return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails(obj6, name2, affiliateRestrictions, null, obj7, secureId, null, id, id2, null, benefitsMetadata, linkedHashMap2, promotionOfferEducation, null, 8776, null);
            }
        }
        promotionOfferEducation = null;
        java.lang.String id3 = item.getId();
        if (item1 == null) {
        }
        java.lang.String obj62 = item.getUrl().toString();
        java.lang.String name22 = item.getName();
        java.lang.String affiliateRestrictions2 = item.getAffiliateRestrictions();
        it = item.getMerchantIdentities().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.MerchantIdentity merchantIdentity2 = (com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.MerchantIdentity) obj;
        if (merchantIdentity2 == null) {
        }
        java.lang.Object logoUrl2 = item.getLogoUrl();
        if (logoUrl2 == null) {
        }
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata(obj2, valueOf);
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetStoreInfoQuery.BnplConfig> bnplConfig2 = item.getBnplConfig();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        it2 = bnplConfig2.iterator();
        while (it2.hasNext()) {
        }
        java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap3.size()));
        while (r4.hasNext()) {
        }
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails(obj62, name22, affiliateRestrictions2, null, obj7, secureId, null, id3, id2, null, benefitsMetadata2, linkedHashMap22, promotionOfferEducation, null, 8776, null);
    }
}
