package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware", f = "DebitCardInContextAcquisitionSideEffectsMiddleware.kt", i = {0}, l = {116}, m = "handleCheckEligibility", n = {"eventDispatcher"}, nl = {117}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware debitCardInContextAcquisitionSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = debitCardInContextAcquisitionSideEffectsMiddleware;
    }
}
