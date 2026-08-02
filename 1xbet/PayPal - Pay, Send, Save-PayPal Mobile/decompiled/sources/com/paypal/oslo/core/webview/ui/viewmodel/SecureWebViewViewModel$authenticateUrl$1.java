package com.paypal.oslo.core.webview.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel", f = "SecureWebViewViewModel.kt", i = {0}, l = {com.visa.cbp.getCertUsage.isReperso}, m = "authenticateUrl", n = {"urlContent"}, nl = {345}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class SecureWebViewViewModel$authenticateUrl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureWebViewViewModel$authenticateUrl$1(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$authenticateUrl$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = secureWebViewViewModel;
    }
}
