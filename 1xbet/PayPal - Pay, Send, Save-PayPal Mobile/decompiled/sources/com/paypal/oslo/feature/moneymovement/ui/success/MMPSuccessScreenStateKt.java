package com.paypal.oslo.feature.moneymovement.ui.success;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/ui/success/SuccessScreenVariant;", "computeVariant", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;)Lcom/paypal/oslo/feature/moneymovement/ui/success/SuccessScreenVariant;", "config", "rememberSuccessScreenVariant", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/moneymovement/ui/success/SuccessScreenVariant;", "", "shouldShowDisclaimerSection", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MMPSuccessScreenStateKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant computeVariant(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
        return com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant.INSTANCE.from(mMPSuccessScreenConfig.getShowMedia(), mMPSuccessScreenData.getMediaUrl().length() > 0, mMPSuccessScreenConfig.getShowPayPalLinkCard());
    }

    public static final com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant rememberSuccessScreenVariant(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1495998642, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.rememberSuccessScreenVariant (MMPSuccessScreenState.kt:46)");
        }
        boolean showMedia = mMPSuccessScreenConfig.getShowMedia();
        boolean showPayPalLinkCard = mMPSuccessScreenConfig.getShowPayPalLinkCard();
        java.lang.String mediaUrl = mMPSuccessScreenData.getMediaUrl();
        boolean changed = composer.changed(showMedia);
        boolean changed2 = composer.changed(showPayPalLinkCard);
        boolean changed3 = composer.changed(mediaUrl);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = computeVariant(mMPSuccessScreenConfig, mMPSuccessScreenData);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant successScreenVariant = (com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return successScreenVariant;
    }

    public static final boolean shouldShowDisclaimerSection(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
        return mMPSuccessScreenConfig.getShowDisclaimer() && mMPSuccessScreenData.getDisclaimerText().length() > 0;
    }
}
