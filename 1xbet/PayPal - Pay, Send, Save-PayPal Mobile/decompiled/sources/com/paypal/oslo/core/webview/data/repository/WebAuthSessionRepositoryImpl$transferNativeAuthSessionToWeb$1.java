package com.paypal.oslo.core.webview.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl", f = "WebAuthSessionRepositoryImpl.kt", i = {0, 0, 0}, l = {64}, m = "transferNativeAuthSessionToWeb", n = {"url", "webAuthContext", "authenticationContext"}, nl = {65}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.transferNativeAuthSessionToWeb(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1(com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl webAuthSessionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = webAuthSessionRepositoryImpl;
    }
}
