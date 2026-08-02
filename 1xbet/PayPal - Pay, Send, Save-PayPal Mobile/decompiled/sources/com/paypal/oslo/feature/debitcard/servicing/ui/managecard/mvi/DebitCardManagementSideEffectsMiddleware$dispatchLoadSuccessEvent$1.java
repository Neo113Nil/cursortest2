package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware", f = "DebitCardManagementSideEffectsMiddleware.kt", i = {0, 0, 0, 0}, l = {354}, m = "dispatchLoadSuccessEvent", n = {"allInstruments", "currentInstrument", "postLoadAction", "eventDispatcher"}, nl = {363}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = debitCardManagementSideEffectsMiddleware;
    }
}
