package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl", f = "EmailServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {81}, m = "initiate-E4ilnuY", n = {"email", "raise$iv$iv$iv", "$this$initiate_E4ilnuY_u24lambda_u240", "input", androidx.core.app.NotificationCompat.CATEGORY_CALL, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailServiceImpl$initiate$2"}, nl = {90}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class EmailServiceImpl$initiate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.mo16282initiateE4ilnuY(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailServiceImpl$initiate$1(com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl emailServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$initiate$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = emailServiceImpl;
    }
}
