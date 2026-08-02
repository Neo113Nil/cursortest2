package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware", f = "ShowDebitCardSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {77}, m = "loadCardDetails", n = {"currentState", "eventDispatcher", "request"}, nl = {78}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class ShowDebitCardSideEffectsMiddleware$loadCardDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowDebitCardSideEffectsMiddleware$loadCardDetails$1(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware showDebitCardSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardSideEffectsMiddleware$loadCardDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = showDebitCardSideEffectsMiddleware;
    }
}
