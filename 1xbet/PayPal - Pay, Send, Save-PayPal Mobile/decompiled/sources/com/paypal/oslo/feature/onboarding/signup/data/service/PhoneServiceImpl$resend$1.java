package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl", f = "PhoneServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {152}, m = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, n = {"raise$iv$iv$iv", "$this$resend_u24lambda_u240", androidx.core.app.NotificationCompat.CATEGORY_CALL, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneServiceImpl$resend$2"}, nl = {161}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneServiceImpl$resend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.resend(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneServiceImpl$resend$1(com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl phoneServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$resend$1> continuation) {
        super(continuation);
        this.getInputFormats = phoneServiceImpl;
    }
}
