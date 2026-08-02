package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware", f = "ManageSecondaryCardSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {88}, m = "loadDebitInstruments", n = {"eventDispatcher", "request", "retryCount"}, nl = {89}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputFormats.getHighSpeedVideoFpsRanges(null, 0, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware manageSecondaryCardSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardSideEffectsMiddleware$loadDebitInstruments$1> continuation) {
        super(continuation);
        this.getOutputFormats = manageSecondaryCardSideEffectsMiddleware;
    }
}
