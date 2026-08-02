package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware", f = "DebitCardAcquisitionIntroSideEffectsMiddleware.kt", i = {0, 0}, l = {62}, m = "checkEligibility", n = {"eventDispatcher", "request"}, nl = {64}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware debitCardAcquisitionIntroSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = debitCardAcquisitionIntroSideEffectsMiddleware;
    }
}
