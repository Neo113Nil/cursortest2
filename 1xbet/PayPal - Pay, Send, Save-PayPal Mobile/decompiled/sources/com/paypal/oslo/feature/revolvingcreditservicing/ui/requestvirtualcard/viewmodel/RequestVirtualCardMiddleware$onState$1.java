package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware", f = "RequestVirtualCardMiddleware.kt", i = {0, 0}, l = {26}, m = "onState", n = {"state", "eventDispatcher"}, nl = {28}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class RequestVirtualCardMiddleware$onState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.onState2((com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestVirtualCardMiddleware$onState$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware requestVirtualCardMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware$onState$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = requestVirtualCardMiddleware;
    }
}
