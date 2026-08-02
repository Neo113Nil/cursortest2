package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/home/PreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesshome/ui/home/EngagementCardUiData;", "Lcom/paypal/oslo/feature/businesshome/ui/home/EngagementCardUiData;", "Camera2StreamConfigurationMap", "()Lcom/paypal/oslo/feature/businesshome/ui/home/EngagementCardUiData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PreviewData {
    public static final com.paypal.oslo.feature.businesshome.ui.home.PreviewData INSTANCE = new com.paypal.oslo.feature.businesshome.ui.home.PreviewData();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData getHighSpeedVideoSizes = new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step[]{new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.CONFIRM_EMAIL, false), new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.ADD_BANK_ACCOUNT, false), new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.VERIFY_ACCOUNT, false)}), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.Engagement.REQUEST_DEBIT_CARD, false)));

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step[]{new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.CONFIRM_EMAIL, true), new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.ADD_BANK_ACCOUNT, true), new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.VERIFY_ACCOUNT, true)}), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.Engagement.REQUEST_DEBIT_CARD, false)));

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData Camera2StreamConfigurationMap = new com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData("BDMC", "Add your card to Apple Wallet", null, "Business Debit Mastercard", "Add now", java.lang.Integer.valueOf(com.paypal.oslo.feature.businesshome.R.drawable.feature_business_home_engagement_card_background1), 4, null);

    private PreviewData() {
    }

    public static com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData Camera2StreamConfigurationMap() {
        return Camera2StreamConfigurationMap;
    }
}
