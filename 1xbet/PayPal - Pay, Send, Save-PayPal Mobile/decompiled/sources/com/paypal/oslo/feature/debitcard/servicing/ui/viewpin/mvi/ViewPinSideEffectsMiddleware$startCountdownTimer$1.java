package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware", f = "ViewPinSideEffectsMiddleware.kt", i = {0, 0, 0, 0}, l = {126}, m = "startCountdownTimer", n = {"eventDispatcher", "expiresInSec", "elapsedSeconds", "$i$a$-repeat-ViewPinSideEffectsMiddleware$startCountdownTimer$2"}, nl = {127}, s = {"L$0", "I$0", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class ViewPinSideEffectsMiddleware$startCountdownTimer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware.access$startCountdownTimer(this.getHighSpeedVideoSizesFor, 0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPinSideEffectsMiddleware$startCountdownTimer$1(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware viewPinSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinSideEffectsMiddleware$startCountdownTimer$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = viewPinSideEffectsMiddleware;
    }
}
