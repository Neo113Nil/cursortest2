package com.paypal.oslo.feature.debitcard.cardacquisition;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"createDebitCardAcquisitionIntroScreen", "", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionSection;", "uiState", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "isUSRegion", "", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;ZLandroidx/compose/runtime/Composer;II)Ljava/util/List;", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAcquisitionScreenDataKt {
    public static final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection> createDebitCardAcquisitionIntroScreen(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState, boolean z, androidx.compose.runtime.Composer composer, int i, int i2) {
        java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionSection> createEUUKIntroSections;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAcquisitionIntroState, "");
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-197228198, i, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.createDebitCardAcquisitionIntroScreen (DebitCardAcquisitionScreenData.kt:60)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        if (z) {
            createEUUKIntroSections = com.paypal.oslo.feature.debitcard.cardacquisition.DebitCardAcquisitionScreenData.INSTANCE.createUSIntroSections(context);
        } else {
            createEUUKIntroSections = com.paypal.oslo.feature.debitcard.cardacquisition.DebitCardAcquisitionScreenData.INSTANCE.createEUUKIntroSections(context, debitCardAcquisitionIntroState);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return createEUUKIntroSections;
    }
}
