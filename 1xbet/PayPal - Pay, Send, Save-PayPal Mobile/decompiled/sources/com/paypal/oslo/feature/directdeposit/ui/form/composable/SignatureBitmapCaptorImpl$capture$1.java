package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl", f = "SignatureBitmapCaptor.kt", i = {0}, l = {24}, m = "capture", n = {"graphicsLayer"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class SignatureBitmapCaptorImpl$capture$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.capture(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignatureBitmapCaptorImpl$capture$1(com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl signatureBitmapCaptorImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl$capture$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = signatureBitmapCaptorImpl;
    }
}
