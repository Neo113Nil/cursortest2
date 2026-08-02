package com.paypal.oslo.feature.onboarding.signup.swg.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl", f = "GoogleTokenCheckerImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {70}, m = "checkToken-_dMVy3A", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$checkToken__dMVy3A_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GoogleTokenCheckerImpl$checkToken$2"}, nl = {71}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class GoogleTokenCheckerImpl$checkToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.mo16038checkToken_dMVy3A(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleTokenCheckerImpl$checkToken$1(com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl googleTokenCheckerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.swg.data.GoogleTokenCheckerImpl$checkToken$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = googleTokenCheckerImpl;
    }
}
