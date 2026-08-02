package com.paypal.oslo.feature.onboarding.signup.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl", f = "PhoneServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {201}, m = "confirm-LcHNf2w", n = {"code", "raise$iv$iv$iv", "$this$confirm_LcHNf2w_u24lambda_u240", "input", androidx.core.app.NotificationCompat.CATEGORY_CALL, "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneServiceImpl$confirm$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneServiceImpl$confirm$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.mo16284confirmLcHNf2w(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneServiceImpl$confirm$1(com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl phoneServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.data.service.PhoneServiceImpl$confirm$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = phoneServiceImpl;
    }
}
