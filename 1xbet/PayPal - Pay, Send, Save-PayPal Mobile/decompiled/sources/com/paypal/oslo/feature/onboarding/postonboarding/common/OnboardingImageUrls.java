package com.paypal.oslo.feature.onboarding.postonboarding.common;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/common/OnboardingImageUrls;", "", "<init>", "()V", "", "ONBOARDING_ACTIVATION_INTRO_BACKGROUND", "Ljava/lang/String;", "ONBOARDING_CELEBRATION_SUCCESS", "ONBOARDING_PUSH_NOTIFICATION_BG", "INTENT_CARD_TRANSFER_MONEY", "INTENT_CARD_SHOP_AND_PAY", "CELEBRATION_P2P_MODAL", "CELEBRATION_SHOP_MODAL", "CELEBRATION_EXPLORE_MODAL", "CELEBRATION_COMMS_MODAL", "CELEBRATION_NFC_MODAL", "", "allImageUrlsToPrefetch", "Ljava/util/List;", "getAllImageUrlsToPrefetch", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardingImageUrls {
    public static final com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls();
    public static final java.lang.String ONBOARDING_ACTIVATION_INTRO_BACKGROUND = "https://www.paypalobjects.com/growth/oslo_postonboarding/Comms_Intro_Background.jpg";
    public static final java.lang.String ONBOARDING_CELEBRATION_SUCCESS = "https://www.paypalobjects.com/growth/reboarding/ppe_de/success%20image.png";
    public static final java.lang.String ONBOARDING_PUSH_NOTIFICATION_BG = "https://www.paypalobjects.com/growth/oslo_postonboarding/oslo_push_notification.png";
    public static final java.lang.String INTENT_CARD_TRANSFER_MONEY = "https://www.paypalobjects.com/growth/oslo_postonboarding/Intent_Card_TransferMoney.jpg";
    public static final java.lang.String INTENT_CARD_SHOP_AND_PAY = "https://www.paypalobjects.com/growth/oslo_postonboarding/Intent_Card_ShopAndPay.jpg";
    public static final java.lang.String CELEBRATION_P2P_MODAL = "https://www.paypalobjects.com/growth/oslo_postonboarding/Celebration_Transfer_Modal.jpg";
    public static final java.lang.String CELEBRATION_SHOP_MODAL = "https://www.paypalobjects.com/growth/oslo_postonboarding/Celebration_Shop_Modal.jpg";
    public static final java.lang.String CELEBRATION_EXPLORE_MODAL = "https://www.paypalobjects.com/growth/oslo_postonboarding/Celebration_Explore_Modal.jpg";
    public static final java.lang.String CELEBRATION_COMMS_MODAL = "https://www.paypalobjects.com/growth/oslo_postonboarding/Celebration_Comms_Modal.jpg";
    public static final java.lang.String CELEBRATION_NFC_MODAL = "https://www.paypalobjects.com/growth/oslo_postonboarding/Celebration_NFC_Modal.jpg";
    private static final java.util.List<java.lang.String> allImageUrlsToPrefetch = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{ONBOARDING_ACTIVATION_INTRO_BACKGROUND, ONBOARDING_CELEBRATION_SUCCESS, ONBOARDING_PUSH_NOTIFICATION_BG, INTENT_CARD_TRANSFER_MONEY, INTENT_CARD_SHOP_AND_PAY, CELEBRATION_P2P_MODAL, CELEBRATION_SHOP_MODAL, CELEBRATION_EXPLORE_MODAL, CELEBRATION_COMMS_MODAL, CELEBRATION_NFC_MODAL});
    public static final int $stable = 8;

    private OnboardingImageUrls() {
    }

    public final java.util.List<java.lang.String> getAllImageUrlsToPrefetch() {
        return allImageUrlsToPrefetch;
    }
}
