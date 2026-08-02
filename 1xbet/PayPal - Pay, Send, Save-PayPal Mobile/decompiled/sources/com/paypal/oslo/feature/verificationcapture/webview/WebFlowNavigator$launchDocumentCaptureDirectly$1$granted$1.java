package com.paypal.oslo.feature.verificationcapture.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1", f = "WebFlowNavigator.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object access$requestCameraPermissionIfNeeded = com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator.access$requestCameraPermissionIfNeeded(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this);
        return access$requestCameraPermissionIfNeeded == coroutine_suspended ? coroutine_suspended : access$requestCameraPermissionIfNeeded;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1(com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator webFlowNavigator, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.webview.WebFlowNavigator$launchDocumentCaptureDirectly$1$granted$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = webFlowNavigator;
        this.getHighSpeedVideoFpsRangesFor = fragmentActivity;
    }
}
