package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware", f = "ChangeCancelSideEffectMiddleware.kt", i = {0, 0, 0}, l = {58}, m = "onEvent", n = {"event", "eventDispatcher", "request"}, nl = {59}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes11.dex */
final class ChangeCancelSideEffectMiddleware$onEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware.access$onEvent(this.getHighSpeedVideoSizesFor, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeCancelSideEffectMiddleware$onEvent$1(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware changeCancelSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware$onEvent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = changeCancelSideEffectMiddleware;
    }
}
