package com.paypal.oslo.feature.onboarding.signup.email.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {120, 74}, m = "confirm-LcHNf2w", n = {"code", "raise$iv$iv$iv", "$this$confirm_LcHNf2w_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$confirm$2", "$i$f$withLock", "code", "raise$iv$iv$iv", "$this$confirm_LcHNf2w_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$confirm$2", "$i$f$withLock", "$i$a$-withLock$default-EmailRepositoryImpl$confirm$2$1"}, nl = {121, 75}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes13.dex */
final class EmailRepositoryImpl$confirm$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizes.mo16340confirmLcHNf2w(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$confirm$1(com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.email.data.repository.EmailRepositoryImpl$confirm$1> continuation) {
        super(continuation);
        this.getOutputSizes = emailRepositoryImpl;
    }
}
