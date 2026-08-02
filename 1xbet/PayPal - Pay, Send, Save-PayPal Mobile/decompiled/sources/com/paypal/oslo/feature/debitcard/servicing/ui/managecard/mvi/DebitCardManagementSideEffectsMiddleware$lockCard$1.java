package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware", f = "DebitCardManagementSideEffectsMiddleware.kt", i = {0, 0, 0, 0}, l = {469}, m = "lockCard", n = {"instrumentId", "currentState", "eventDispatcher", "request"}, nl = {470}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementSideEffectsMiddleware$lockCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI(null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardManagementSideEffectsMiddleware$lockCard$1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$lockCard$1> continuation) {
        super(continuation);
        this.getOutputFormats = debitCardManagementSideEffectsMiddleware;
    }
}
