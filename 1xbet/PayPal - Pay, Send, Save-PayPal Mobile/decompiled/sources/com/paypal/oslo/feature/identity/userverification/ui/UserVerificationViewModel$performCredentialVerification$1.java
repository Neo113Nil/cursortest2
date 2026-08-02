package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel", f = "UserVerificationViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {397, 403, com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED}, m = "performCredentialVerification", n = {"credential", "request", "isPhoneMode", "credential", "request", "result", "this_$iv", "it$iv", "verificationResult", "loginType", "isPhoneMode", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UserVerificationViewModel$performCredentialVerification$2", "credential", "request", "result", "this_$iv", "it$iv", "verificationResult", "loginType", "isPhoneMode", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UserVerificationViewModel$performCredentialVerification$2"}, nl = {398, 404, 408}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "Z$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "Z$0", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$performCredentialVerification$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$performCredentialVerification(this.getOutputStallDuration, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$performCredentialVerification$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$performCredentialVerification$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = userVerificationViewModel;
    }
}
