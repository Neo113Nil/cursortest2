package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel$Companion;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "initialLoading", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel$Companion;Landroid/content/Context;)Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubUiModelKt {
    private static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel Camera2StreamConfigurationMap;

    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel initialLoading(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel.Companion companion, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel = Camera2StreamConfigurationMap;
        if (payLaterHubUiModel != null) {
            return payLaterHubUiModel;
        }
        context.getApplicationContext();
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider payLaterHubContentProvider = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider();
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider.AcqContent acqContent = payLaterHubContentProvider.getAcqContent();
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.content.PayLaterHubContentProvider.ShopNowPayLaterContent shopNowPayLaterContent = payLaterHubContentProvider.getShopNowPayLaterContent();
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel payLaterHubUiModel2 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel(null, null, payLaterHubContentProvider.getToolbarTitle(), new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.ShopNowPayLaterUiModel(shopNowPayLaterContent.getShopNow(), shopNowPayLaterContent.getPayLater()), com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel.INSTANCE.getPlaceholder(), new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcqSectionUiModel(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.AcquisitionApplyUiModel(acqContent.getTitle(), new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(acqContent.getHeader(), acqContent.getSubHeader(), acqContent.getBadgeText(), acqContent.getApplyButtonText()))), com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PlanSectionUiModel.INSTANCE.getPlaceholder(), com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.UnusedVirtualCardUiModel.INSTANCE.getPlaceholder(), new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.CheckoutSectionUiModel(payLaterHubContentProvider.getCheckoutContent().getSectionTitle(), com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.createCheckoutModels$default(new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CheckoutContent(payLaterHubContentProvider.getCheckoutContent().getStepOne(), payLaterHubContentProvider.getCheckoutContent().getStepTwo(), payLaterHubContentProvider.getCheckoutContent().getStepThree(), payLaterHubContentProvider.getCheckoutContent().getPayIn4Title(), payLaterHubContentProvider.getCheckoutContent().getPayIn4Description(), payLaterHubContentProvider.getCheckoutContent().getPayMonthlyTitle(), payLaterHubContentProvider.getCheckoutContent().getPayMonthlyDescription(), payLaterHubContentProvider.getCheckoutContent().getPayIn1Title(), payLaterHubContentProvider.getCheckoutContent().getPayIn1Description()), null, 2, null)), 3, null);
        Camera2StreamConfigurationMap = payLaterHubUiModel2;
        return payLaterHubUiModel2;
    }
}
