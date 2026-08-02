package com.paypal.oslo.feature.identity.userverification.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase", f = "FetchGoogleSignUpDetailsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {56}, m = "invoke", n = {"activityContext", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FetchGoogleSignUpDetailsUseCase$invoke$2"}, nl = {64}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class FetchGoogleSignUpDetailsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchGoogleSignUpDetailsUseCase$invoke$1(com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase fetchGoogleSignUpDetailsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = fetchGoogleSignUpDetailsUseCase;
    }
}
