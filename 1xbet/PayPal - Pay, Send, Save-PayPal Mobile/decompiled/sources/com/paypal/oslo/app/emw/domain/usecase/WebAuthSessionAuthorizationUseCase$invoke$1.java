package com.paypal.oslo.app.emw.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase", f = "WebAuthSessionAuthorizationUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {69}, m = "invoke", n = {"webAuthContext", "url", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-WebAuthSessionAuthorizationUseCase$invoke$2"}, nl = {73}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes10.dex */
final class WebAuthSessionAuthorizationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebAuthSessionAuthorizationUseCase$invoke$1(com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = webAuthSessionAuthorizationUseCase;
    }
}
