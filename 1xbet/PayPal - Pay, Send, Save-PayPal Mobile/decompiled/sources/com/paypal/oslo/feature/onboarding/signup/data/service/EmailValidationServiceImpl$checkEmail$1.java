package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl", f = "EmailValidationServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {60}, m = "checkEmail-E4ilnuY", n = {"email", "raise$iv$iv$iv", "$this$checkEmail_E4ilnuY_u24lambda_u240", "query", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailValidationServiceImpl$checkEmail$2"}, nl = {65}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class EmailValidationServiceImpl$checkEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputSizes.mo16283checkEmailE4ilnuY(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailValidationServiceImpl$checkEmail$1(com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl emailValidationServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.data.service.EmailValidationServiceImpl$checkEmail$1> continuation) {
        super(continuation);
        this.getOutputSizes = emailValidationServiceImpl;
    }
}
