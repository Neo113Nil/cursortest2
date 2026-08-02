package com.paypal.oslo.feature.onboarding.signup.email.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {120, 54, 56}, m = "requestCode-E4ilnuY", n = {"email", "raise$iv$iv$iv", "$this$requestCode_E4ilnuY_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$requestCode$2", "$i$f$withLock", "email", "raise$iv$iv$iv", "$this$requestCode_E4ilnuY_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$requestCode$2", "$i$f$withLock", "$i$a$-withLock$default-EmailRepositoryImpl$requestCode$2$1", "email", "raise$iv$iv$iv", "$this$requestCode_E4ilnuY_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$requestCode$2", "$i$f$withLock", "$i$a$-withLock$default-EmailRepositoryImpl$requestCode$2$1"}, nl = {121, 56, 53}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes13.dex */
final class EmailRepositoryImpl$requestCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.mo16341requestCodeE4ilnuY(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$requestCode$1(com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$requestCode$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = emailRepositoryImpl;
    }
}
