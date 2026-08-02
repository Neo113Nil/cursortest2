package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl", f = "EmailServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {127}, m = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, n = {"raise$iv$iv$iv", "$this$resend_u24lambda_u240", androidx.core.app.NotificationCompat.CATEGORY_CALL, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailServiceImpl$resend$2"}, nl = {136}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class EmailServiceImpl$resend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.resend(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailServiceImpl$resend$1(com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl emailServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.data.service.EmailServiceImpl$resend$1> continuation) {
        super(continuation);
        this.getInputFormats = emailServiceImpl;
    }
}
