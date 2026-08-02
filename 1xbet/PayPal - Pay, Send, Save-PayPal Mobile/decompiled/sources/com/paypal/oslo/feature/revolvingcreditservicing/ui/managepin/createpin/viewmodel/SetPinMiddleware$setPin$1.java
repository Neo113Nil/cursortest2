package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware", f = "SetPinMiddleware.kt", i = {0, 0, 0, 0}, l = {39}, m = "setPin", n = {"state", "eventDispatcher", "$this$setPin_u24lambda_u241", "$i$a$-run-SetPinMiddleware$setPin$event$2"}, nl = {40}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class SetPinMiddleware$setPin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetPinMiddleware$setPin$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware setPinMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.SetPinMiddleware$setPin$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = setPinMiddleware;
    }
}
