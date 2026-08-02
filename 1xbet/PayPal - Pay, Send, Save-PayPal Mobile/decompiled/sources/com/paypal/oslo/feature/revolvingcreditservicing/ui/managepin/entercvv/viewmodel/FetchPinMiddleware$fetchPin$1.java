package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware", f = "FetchPinMiddleware.kt", i = {0, 0}, l = {32}, m = "fetchPin", n = {com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "eventDispatcher"}, nl = {33}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class FetchPinMiddleware$fetchPin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPinMiddleware$fetchPin$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware fetchPinMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware$fetchPin$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = fetchPinMiddleware;
    }
}
