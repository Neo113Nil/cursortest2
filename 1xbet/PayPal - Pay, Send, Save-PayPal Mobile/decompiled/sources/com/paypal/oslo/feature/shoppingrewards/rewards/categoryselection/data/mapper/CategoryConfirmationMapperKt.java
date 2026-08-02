package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;", "expiryTime", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategoryConfirmationData;", "toCategoryConfirmationData", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment$OnRewardsCategoryOffer;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/CategoryConfirmationData;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/ConfirmCategoryUseCase$Response;", "toConfirmCategoryResponse", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Data;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/usecase/ConfirmCategoryUseCase$Response;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategoryConfirmationMapperKt {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        try {
            java.lang.String format = java.time.Instant.parse(str).atZone(java.time.ZoneId.systemDefault()).format(java.time.format.DateTimeFormatter.ofPattern("h:mm a z, MMMM d, yyyy", java.util.Locale.US));
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.time.format.DateTimeParseException unused) {
            return "";
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategoryConfirmationData toCategoryConfirmationData$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toCategoryConfirmationData(onRewardsCategoryOffer, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategoryConfirmationData toCategoryConfirmationData(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer, java.lang.String str) {
        java.lang.String offerDetailsExpirationText;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType iconType;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRewardsCategoryOffer, "");
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
        if (highSpeedVideoFpsRangesFor.length() > 0) {
            offerDetailsExpirationText = kotlin.text.StringsKt.replace$default(onRewardsCategoryOffer.getOfferDetailsExpirationText(), "__expiration_datetime__", highSpeedVideoFpsRangesFor, false, 4, (java.lang.Object) null);
        } else {
            offerDetailsExpirationText = onRewardsCategoryOffer.getOfferDetailsExpirationText();
        }
        java.lang.String str3 = offerDetailsExpirationText;
        java.lang.String offerDetailsOfferTitleText = onRewardsCategoryOffer.getOfferDetailsOfferTitleText();
        java.lang.Object offerDetailsHeroImageUrl = onRewardsCategoryOffer.getOfferDetailsHeroImageUrl();
        kotlin.jvm.internal.Intrinsics.checkNotNull(offerDetailsHeroImageUrl, "");
        java.lang.String str4 = (java.lang.String) offerDetailsHeroImageUrl;
        java.util.List<java.lang.String> offerDetailsTexts = onRewardsCategoryOffer.getOfferDetailsTexts();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(offerDetailsTexts, 10));
        int i = 0;
        for (java.lang.Object obj : offerDetailsTexts) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.String str5 = (java.lang.String) obj;
            java.lang.String str6 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(onRewardsCategoryOffer.getOfferDetailsPpuiTokens(), i);
            if (str6 != null) {
                int hashCode = str6.hashCode();
                if (hashCode == -865286608) {
                    if (str6.equals("trophy")) {
                        iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.TROPHY_ICON;
                    }
                    iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.NONE;
                } else if (hashCode == -178324674) {
                    if (str6.equals("calendar")) {
                        iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.CALENDAR_ICON;
                    }
                    iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.NONE;
                } else {
                    if (hashCode == 3046160 && str6.equals("card")) {
                        iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.CARD_ICON;
                    }
                    iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.NONE;
                }
                str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(onRewardsCategoryOffer.getOfferDetailsSubtexts(), i);
                if (str2 != null) {
                    str2 = "";
                }
                arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainConfirmationDetailItem(iconType, str5, str2));
                i++;
            }
            iconType = com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.IconType.TROPHY_ICON;
            str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(onRewardsCategoryOffer.getOfferDetailsSubtexts(), i);
            if (str2 != null) {
            }
            arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainConfirmationDetailItem(iconType, str5, str2));
            i++;
        }
        java.lang.String offerDetailsTermsText = onRewardsCategoryOffer.getOfferDetailsTermsText();
        java.lang.Object offerDetailsTermsUrl = onRewardsCategoryOffer.getOfferDetailsTermsUrl();
        kotlin.jvm.internal.Intrinsics.checkNotNull(offerDetailsTermsUrl, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategoryConfirmationData(offerDetailsOfferTitleText, str4, str3, arrayList, offerDetailsTermsText, (java.lang.String) offerDetailsTermsUrl, new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonData(onRewardsCategoryOffer.getOfferDetailsCtaText(), com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState.ENABLED));
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response toConfirmCategoryResponse(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data data) {
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.CategoryConfirmationData categoryConfirmationData;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset> presentmentAssets;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset presentmentAsset;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.OnRewardsCategoryOffer onRewardsCategoryOffer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer = data.getEnrollInPromotionOffer();
        com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer = enrollInPromotionOffer.getOffer();
        if (offer == null || (categoryDetailsPresentmentFragment = offer.getCategoryDetailsPresentmentFragment()) == null || (presentmentAssets = categoryDetailsPresentmentFragment.getPresentmentAssets()) == null || (presentmentAsset = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment.PresentmentAsset) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) presentmentAssets)) == null || (onRewardsCategoryOffer = presentmentAsset.getOnRewardsCategoryOffer()) == null) {
            categoryConfirmationData = null;
        } else {
            java.lang.Object expiryTime = enrollInPromotionOffer.getExpiryTime();
            categoryConfirmationData = toCategoryConfirmationData(onRewardsCategoryOffer, expiryTime instanceof java.lang.String ? (java.lang.String) expiryTime : null);
        }
        java.lang.String id = enrollInPromotionOffer.getId();
        java.lang.Object expiryTime2 = enrollInPromotionOffer.getExpiryTime();
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response(id, expiryTime2 instanceof java.lang.String ? (java.lang.String) expiryTime2 : null, categoryConfirmationData);
    }
}
