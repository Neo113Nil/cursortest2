package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/DebitCardCreationSuccessScreenData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;", "getImageWidget", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionImageWidget;", "Landroid/content/Context;", "context", "", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionTextWidget;", "getTitleTextWidget", "(Landroid/content/Context;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionTextWidget;", "getDescriptionTextWidget", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionTextWidget;", "ImageUrls"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardCreationSuccessScreenData {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenData INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenData();

    private DebitCardCreationSuccessScreenData() {
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget getImageWidget() {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionImageWidget("https://www.paypalobjects.com/ucs/illustrations/bdmc/CardConfirmation-Phone-4x.png", 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget getTitleTextWidget(android.content.Context context, java.lang.String username) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "");
        java.lang.String string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_acquisition_card_creation_success_title, username);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget(string, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, null, 113848, null);
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget getDescriptionTextWidget(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getString(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_acquisition_card_creation_success_description, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.BDMC_US_CASHBACK_PERCENTAGE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
        com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
        return new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionTextWidget(string, bodyLarge, contentMuted, null, null, null, com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, null, 113720, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/success/DebitCardCreationSuccessScreenData$ImageUrls;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ImageUrls {
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenData.ImageUrls INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenData.ImageUrls();

        private ImageUrls() {
        }
    }
}
