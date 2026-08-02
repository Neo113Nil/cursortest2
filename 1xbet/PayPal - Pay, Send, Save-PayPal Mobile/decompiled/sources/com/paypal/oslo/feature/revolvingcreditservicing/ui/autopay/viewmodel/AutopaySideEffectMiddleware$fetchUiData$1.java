package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware", f = "AutopaySideEffectMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {50, 60}, m = "fetchUiData", n = {"state", "eventDispatcher", "request", "state", "eventDispatcher", "request", "this_$iv", "autopayOverviewData", "$i$f$fold", "$i$a$-fold-AutopaySideEffectMiddleware$fetchUiData$3"}, nl = {134, 61}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class AutopaySideEffectMiddleware$fetchUiData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutopaySideEffectMiddleware$fetchUiData$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware autopaySideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$fetchUiData$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = autopaySideEffectMiddleware;
    }
}
