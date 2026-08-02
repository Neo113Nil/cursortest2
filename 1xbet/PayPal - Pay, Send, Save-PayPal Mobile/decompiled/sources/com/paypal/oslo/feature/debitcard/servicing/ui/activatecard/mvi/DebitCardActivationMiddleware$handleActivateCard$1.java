package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware", f = "DebitCardActivationMiddleware.kt", i = {0, 0, 0}, l = {78}, m = "handleActivateCard", n = {com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "eventDispatcher", "request"}, nl = {79}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardActivationMiddleware$handleActivateCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardActivationMiddleware$handleActivateCard$1(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware debitCardActivationMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationMiddleware$handleActivateCard$1> continuation) {
        super(continuation);
        this.getInputFormats = debitCardActivationMiddleware;
    }
}
