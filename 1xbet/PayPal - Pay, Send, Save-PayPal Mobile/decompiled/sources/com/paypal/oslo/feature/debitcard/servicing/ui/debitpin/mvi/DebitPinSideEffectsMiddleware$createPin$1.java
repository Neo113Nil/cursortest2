package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware", f = "DebitPinSideEffectsMiddleware.kt", i = {0, 0, 0}, l = {75}, m = "createPin", n = {"pin", "eventDispatcher", "request"}, nl = {76}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class DebitPinSideEffectsMiddleware$createPin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitPinSideEffectsMiddleware$createPin$1(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware debitPinSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinSideEffectsMiddleware$createPin$1> continuation) {
        super(continuation);
        this.getOutputFormats = debitPinSideEffectsMiddleware;
    }
}
