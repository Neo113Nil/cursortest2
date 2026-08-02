package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/PreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "BASE_OFFER_DETAILS_UI_DATA", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "getBASE_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "ACTIVE_OFFER_DETAILS_UI_DATA", "getACTIVE_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease", "ACTIVATING_OFFER_DETAILS_UI_DATA", "getACTIVATING_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease", "INACTIVE_OFFER_DETAILS_UI_DATA", "getINACTIVE_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease", "MULTI_LINK_TERMS_OFFER_DETAILS_UI_DATA", "getMULTI_LINK_TERMS_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreviewData {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData ACTIVATING_OFFER_DETAILS_UI_DATA;
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData ACTIVE_OFFER_DETAILS_UI_DATA;
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData BASE_OFFER_DETAILS_UI_DATA;
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData INACTIVE_OFFER_DETAILS_UI_DATA;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.PreviewData INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.PreviewData();
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData MULTI_LINK_TERMS_OFFER_DETAILS_UI_DATA;

    private PreviewData() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getBASE_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease() {
        return BASE_OFFER_DETAILS_UI_DATA;
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData copy;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData copy2;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData copy3;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData("targetingUnitId", "+2000 Points", "Shop and earn rewards", new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress(new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData(0, 3, 2, null, 0, 0, 57, null)), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsItemUiData[]{new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsItemUiData(com.paypal.pds.core.Icon.Clock.INSTANCE, "Valid until Dec 31"), new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsItemUiData(com.paypal.pds.core.Icon.ShoppingBag.INSTANCE, "Shop at participating merchants")}), "Terms and conditions", "https://example.com/terms", null, new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData("Active", null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_ENABLED(), 2, null), false, false, 1152, null);
        BASE_OFFER_DETAILS_UI_DATA = offerDetailsUiData;
        copy = offerDetailsUiData.copy((r24 & 1) != 0 ? offerDetailsUiData.offerId : null, (r24 & 2) != 0 ? offerDetailsUiData.title : null, (r24 & 4) != 0 ? offerDetailsUiData.subtitle : null, (r24 & 8) != 0 ? offerDetailsUiData.headerType : null, (r24 & 16) != 0 ? offerDetailsUiData.detailsItems : null, (r24 & 32) != 0 ? offerDetailsUiData.termsText : null, (r24 & 64) != 0 ? offerDetailsUiData.termsTextLink : null, (r24 & 128) != 0 ? offerDetailsUiData.termsUrls : null, (r24 & 256) != 0 ? offerDetailsUiData.buttonCta : new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData("Active", null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_DISABLED(), 2, null), (r24 & 512) != 0 ? offerDetailsUiData.isActive : true, (r24 & 1024) != 0 ? offerDetailsUiData.wasActivatedThisSession : false);
        ACTIVE_OFFER_DETAILS_UI_DATA = copy;
        ACTIVATING_OFFER_DETAILS_UI_DATA = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.INSTANCE.getAsActivating(copy);
        copy2 = offerDetailsUiData.copy((r24 & 1) != 0 ? offerDetailsUiData.offerId : null, (r24 & 2) != 0 ? offerDetailsUiData.title : null, (r24 & 4) != 0 ? offerDetailsUiData.subtitle : null, (r24 & 8) != 0 ? offerDetailsUiData.headerType : new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo("http://merchant.com/logo"), (r24 & 16) != 0 ? offerDetailsUiData.detailsItems : null, (r24 & 32) != 0 ? offerDetailsUiData.termsText : null, (r24 & 64) != 0 ? offerDetailsUiData.termsTextLink : null, (r24 & 128) != 0 ? offerDetailsUiData.termsUrls : null, (r24 & 256) != 0 ? offerDetailsUiData.buttonCta : new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData("Activate", null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_ENABLED(), 2, null), (r24 & 512) != 0 ? offerDetailsUiData.isActive : false, (r24 & 1024) != 0 ? offerDetailsUiData.wasActivatedThisSession : false);
        INACTIVE_OFFER_DETAILS_UI_DATA = copy2;
        copy3 = offerDetailsUiData.copy((r24 & 1) != 0 ? offerDetailsUiData.offerId : null, (r24 & 2) != 0 ? offerDetailsUiData.title : null, (r24 & 4) != 0 ? offerDetailsUiData.subtitle : null, (r24 & 8) != 0 ? offerDetailsUiData.headerType : null, (r24 & 16) != 0 ? offerDetailsUiData.detailsItems : null, (r24 & 32) != 0 ? offerDetailsUiData.termsText : "By activating, you agree to the __Terms of Service__ and __Privacy Policy__", (r24 & 64) != 0 ? offerDetailsUiData.termsTextLink : null, (r24 & 128) != 0 ? offerDetailsUiData.termsUrls : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"https://www.paypal.com/terms", "https://www.paypal.com/privacy"}), (r24 & 256) != 0 ? offerDetailsUiData.buttonCta : null, (r24 & 512) != 0 ? offerDetailsUiData.isActive : false, (r24 & 1024) != 0 ? offerDetailsUiData.wasActivatedThisSession : false);
        MULTI_LINK_TERMS_OFFER_DETAILS_UI_DATA = copy3;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getACTIVE_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease() {
        return ACTIVE_OFFER_DETAILS_UI_DATA;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getACTIVATING_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease() {
        return ACTIVATING_OFFER_DETAILS_UI_DATA;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getINACTIVE_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease() {
        return INACTIVE_OFFER_DETAILS_UI_DATA;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getMULTI_LINK_TERMS_OFFER_DETAILS_UI_DATA$shopping_rewards_prodRelease() {
        return MULTI_LINK_TERMS_OFFER_DETAILS_UI_DATA;
    }
}
