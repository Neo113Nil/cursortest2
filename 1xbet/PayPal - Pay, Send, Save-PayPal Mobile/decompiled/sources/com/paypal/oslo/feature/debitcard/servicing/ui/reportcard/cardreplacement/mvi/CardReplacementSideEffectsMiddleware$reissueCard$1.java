package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware", f = "CardReplacementSideEffectsMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {91, 93}, m = "reissueCard", n = {"eventDispatcher", "addressId", "request", "eventDispatcher", "addressId", "request", "result"}, nl = {92, 94}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class CardReplacementSideEffectsMiddleware$reissueCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputFormats.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardReplacementSideEffectsMiddleware$reissueCard$1(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware cardReplacementSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementSideEffectsMiddleware$reissueCard$1> continuation) {
        super(continuation);
        this.getOutputFormats = cardReplacementSideEffectsMiddleware;
    }
}
