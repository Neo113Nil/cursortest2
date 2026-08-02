package com.paypal.oslo.feature.onboarding.signup.email;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl", f = "EmailCheckerImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {68}, m = "checkEmail-E4ilnuY", n = {"email", "raise$iv$iv$iv", "$this$checkEmail_E4ilnuY_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailCheckerImpl$checkEmail$2"}, nl = {69}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class EmailCheckerImpl$checkEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.mo15856checkEmailE4ilnuY(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailCheckerImpl$checkEmail$1(com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl emailCheckerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.EmailCheckerImpl$checkEmail$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = emailCheckerImpl;
    }
}
