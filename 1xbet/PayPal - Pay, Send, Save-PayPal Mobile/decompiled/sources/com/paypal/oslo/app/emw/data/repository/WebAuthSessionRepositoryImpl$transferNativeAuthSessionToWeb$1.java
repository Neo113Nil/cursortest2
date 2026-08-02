package com.paypal.oslo.app.emw.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.emw.data.repository.WebAuthSessionRepositoryImpl", f = "WebAuthSessionRepositoryImpl.kt", i = {0, 0, 0}, l = {46}, m = "transferNativeAuthSessionToWeb", n = {"url", "webAuthContext", "authenticationContext"}, nl = {47}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.app.emw.data.repository.WebAuthSessionRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.transferNativeAuthSessionToWeb(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1(com.paypal.oslo.app.emw.data.repository.WebAuthSessionRepositoryImpl webAuthSessionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.emw.data.repository.WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = webAuthSessionRepositoryImpl;
    }
}
