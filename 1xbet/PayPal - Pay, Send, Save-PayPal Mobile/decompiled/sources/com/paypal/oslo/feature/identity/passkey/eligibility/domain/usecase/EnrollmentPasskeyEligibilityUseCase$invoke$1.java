package com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase", f = "EnrollmentPasskeyEligibilityUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {53, 57}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EnrollmentPasskeyEligibilityUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EnrollmentPasskeyEligibilityUseCase$invoke$2"}, nl = {57, 58}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class EnrollmentPasskeyEligibilityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrollmentPasskeyEligibilityUseCase$invoke$1(com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase enrollmentPasskeyEligibilityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase.EnrollmentPasskeyEligibilityUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = enrollmentPasskeyEligibilityUseCase;
    }
}
