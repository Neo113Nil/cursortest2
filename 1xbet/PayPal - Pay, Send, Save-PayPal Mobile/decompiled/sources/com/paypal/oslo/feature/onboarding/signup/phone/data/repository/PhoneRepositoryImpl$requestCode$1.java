package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl", f = "PhoneRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {136, 75, 78}, m = "requestCode-AttygxE", n = {"phone", "signupCountryCode", "phoneConfirmationDetails", "raise$iv$iv$iv", "$this$requestCode_AttygxE_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$requestCode$2", "$i$f$withLock", "phone", "signupCountryCode", "phoneConfirmationDetails", "raise$iv$iv$iv", "$this$requestCode_AttygxE_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$requestCode$2", "$i$f$withLock", "$i$a$-withLock$default-PhoneRepositoryImpl$requestCode$2$1", "phone", "signupCountryCode", "phoneConfirmationDetails", "raise$iv$iv$iv", "$this$requestCode_AttygxE_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$requestCode$2", "$i$f$withLock", "$i$a$-withLock$default-PhoneRepositoryImpl$requestCode$2$1"}, nl = {137, 76, 82}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneRepositoryImpl$requestCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl isOutputSupportedFor;
    /* synthetic */ java.lang.Object toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.toString = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.mo16390requestCodeAttygxE(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneRepositoryImpl$requestCode$1(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl phoneRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$requestCode$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = phoneRepositoryImpl;
    }
}
