package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABViewModelKt {
    public static final /* synthetic */ boolean access$getHasMerchantOffer(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata) {
        return (benefitsMetadata.getPercentBack() == null && benefitsMetadata.getPointsBack() == null) ? false : true;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails access$mergeWith(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails2) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails copy;
        java.lang.String url = iabOfferDetails2.getUrl();
        if (url == null) {
            url = iabOfferDetails.getUrl();
        }
        java.lang.String str = url;
        java.lang.String merchantName = iabOfferDetails2.getMerchantName();
        if (merchantName == null) {
            merchantName = iabOfferDetails.getMerchantName();
        }
        java.lang.String str2 = merchantName;
        java.lang.String merchantDisplayName = iabOfferDetails2.getMerchantDisplayName();
        if (merchantDisplayName == null) {
            merchantDisplayName = iabOfferDetails.getMerchantDisplayName();
        }
        java.lang.String str3 = merchantDisplayName;
        java.lang.String merchantLogoUrl = iabOfferDetails2.getMerchantLogoUrl();
        if (merchantLogoUrl == null) {
            merchantLogoUrl = iabOfferDetails.getMerchantLogoUrl();
        }
        java.lang.String str4 = merchantLogoUrl;
        java.lang.String toolbarSubtitle = iabOfferDetails2.getToolbarSubtitle();
        if (toolbarSubtitle == null) {
            toolbarSubtitle = iabOfferDetails.getToolbarSubtitle();
        }
        java.lang.String str5 = toolbarSubtitle;
        java.lang.String honeyStoreId = iabOfferDetails2.getHoneyStoreId();
        if (honeyStoreId == null) {
            honeyStoreId = iabOfferDetails.getHoneyStoreId();
        }
        java.lang.String str6 = honeyStoreId;
        java.lang.String offerId = iabOfferDetails2.getOfferId();
        if (offerId == null) {
            offerId = iabOfferDetails.getOfferId();
        }
        java.lang.String str7 = offerId;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails interstitialDetails = iabOfferDetails2.getInterstitialDetails();
        if (interstitialDetails == null) {
            interstitialDetails = iabOfferDetails.getInterstitialDetails();
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails iabInterstitialDetails = interstitialDetails;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = iabOfferDetails.getBenefitsMetadata();
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2 = iabOfferDetails2.getBenefitsMetadata();
        java.lang.String percentBack = benefitsMetadata2.getPercentBack();
        if (percentBack == null) {
            percentBack = benefitsMetadata.getPercentBack();
        }
        java.lang.String pointsBack = benefitsMetadata2.getPointsBack();
        if (pointsBack == null) {
            pointsBack = benefitsMetadata.getPointsBack();
        }
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata copy2 = benefitsMetadata.copy(percentBack, pointsBack);
        java.util.Map<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata> bnplMetadata = iabOfferDetails2.getBnplMetadata();
        if (bnplMetadata.isEmpty()) {
            bnplMetadata = iabOfferDetails.getBnplMetadata();
        }
        java.util.Map<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata> map = bnplMetadata;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation promotionOfferEducation = iabOfferDetails2.getPromotionOfferEducation();
        if (promotionOfferEducation == null) {
            promotionOfferEducation = iabOfferDetails.getPromotionOfferEducation();
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation promotionOfferEducation2 = promotionOfferEducation;
        java.lang.String secureId = iabOfferDetails2.getSecureId();
        if (secureId == null) {
            secureId = iabOfferDetails.getSecureId();
        }
        copy = iabOfferDetails.copy((r30 & 1) != 0 ? iabOfferDetails.url : str, (r30 & 2) != 0 ? iabOfferDetails.merchantName : str2, (r30 & 4) != 0 ? iabOfferDetails.affiliateRestrictions : null, (r30 & 8) != 0 ? iabOfferDetails.merchantDisplayName : str3, (r30 & 16) != 0 ? iabOfferDetails.merchantLogoUrl : str4, (r30 & 32) != 0 ? iabOfferDetails.secureId : secureId, (r30 & 64) != 0 ? iabOfferDetails.toolbarSubtitle : str5, (r30 & 128) != 0 ? iabOfferDetails.honeyStoreId : str6, (r30 & 256) != 0 ? iabOfferDetails.offerId : str7, (r30 & 512) != 0 ? iabOfferDetails.benefits : null, (r30 & 1024) != 0 ? iabOfferDetails.benefitsMetadata : copy2, (r30 & 2048) != 0 ? iabOfferDetails.bnplMetadata : map, (r30 & 4096) != 0 ? iabOfferDetails.promotionOfferEducation : promotionOfferEducation2, (r30 & 8192) != 0 ? iabOfferDetails.interstitialDetails : iabInterstitialDetails);
        return copy;
    }
}
