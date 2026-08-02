package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1", f = "VerificationCaptureJavaScriptInterface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes2.dex */
final class VerificationCaptureJavaScriptInterface$closeIdAssurance$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            verificationCaptureWebViewDelegateImpl = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> closeHandler$verification_capture_prodRelease = verificationCaptureWebViewDelegateImpl.getCloseHandler$verification_capture_prodRelease();
            if (closeHandler$verification_capture_prodRelease == null) {
                appNavigator = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                closeHandler$verification_capture_prodRelease.invoke(this.getHighSpeedVideoFpsRanges);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureJavaScriptInterface$closeIdAssurance$1(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface verificationCaptureJavaScriptInterface, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureJavaScriptInterface$closeIdAssurance$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = verificationCaptureJavaScriptInterface;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
