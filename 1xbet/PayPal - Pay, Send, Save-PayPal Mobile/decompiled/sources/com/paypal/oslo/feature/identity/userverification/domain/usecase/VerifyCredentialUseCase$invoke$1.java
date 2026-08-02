package com.paypal.oslo.feature.identity.userverification.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase", f = "VerifyCredentialUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {64, 70, 79, 84}, m = "invoke", n = {"verifyCredentialRequest", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifyCredentialUseCase$invoke$2", "isCheckEmailSupportFeatureEnabled", "verifyCredentialRequest", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "emailVerificationResult", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifyCredentialUseCase$invoke$2", "isCheckEmailSupportFeatureEnabled", "verifyCredentialRequest", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifyCredentialUseCase$invoke$2", "isCheckEmailSupportFeatureEnabled", "verifyCredentialRequest", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifyCredentialUseCase$invoke$2"}, nl = {65, 72, 82, 57}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class VerifyCredentialUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerifyCredentialUseCase$invoke$1(com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = verifyCredentialUseCase;
    }
}
