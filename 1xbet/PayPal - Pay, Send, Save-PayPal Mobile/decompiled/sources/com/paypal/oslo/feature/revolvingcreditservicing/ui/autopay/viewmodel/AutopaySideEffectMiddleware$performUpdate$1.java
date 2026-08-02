package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware", f = "AutopaySideEffectMiddleware.kt", i = {0, 0, 0, 0, 0}, l = {119}, m = "performUpdate", n = {"state", "eventDispatcher", "requestCreditAccountId", "customAmount", "request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes14.dex */
final class AutopaySideEffectMiddleware$performUpdate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutopaySideEffectMiddleware$performUpdate$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware autopaySideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopaySideEffectMiddleware$performUpdate$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = autopaySideEffectMiddleware;
    }
}
