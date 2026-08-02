package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl", f = "PhoneRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {136, 90}, m = "confirm-LcHNf2w", n = {"code", "raise$iv$iv$iv", "$this$confirm_LcHNf2w_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$confirm$2", "$i$f$withLock", "code", "raise$iv$iv$iv", "$this$confirm_LcHNf2w_u24lambda_u240", "$this$withLock_u24default$iv", "$completion$iv", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$confirm$2", "$i$f$withLock", "$i$a$-withLock$default-PhoneRepositoryImpl$confirm$2$1"}, nl = {137, 91}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneRepositoryImpl$confirm$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.mo16389confirmLcHNf2w(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneRepositoryImpl$confirm$1(com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl phoneRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl$confirm$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = phoneRepositoryImpl;
    }
}
