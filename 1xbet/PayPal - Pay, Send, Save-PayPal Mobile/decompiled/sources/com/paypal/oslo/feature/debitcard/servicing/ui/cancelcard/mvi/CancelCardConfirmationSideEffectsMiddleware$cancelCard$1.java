package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware", f = "CancelCardConfirmationSideEffectsMiddleware.kt", i = {0, 0}, l = {64}, m = "cancelCard", n = {"eventDispatcher", "request"}, nl = {65}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class CancelCardConfirmationSideEffectsMiddleware$cancelCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelCardConfirmationSideEffectsMiddleware$cancelCard$1(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware cancelCardConfirmationSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardConfirmationSideEffectsMiddleware$cancelCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cancelCardConfirmationSideEffectsMiddleware;
    }
}
