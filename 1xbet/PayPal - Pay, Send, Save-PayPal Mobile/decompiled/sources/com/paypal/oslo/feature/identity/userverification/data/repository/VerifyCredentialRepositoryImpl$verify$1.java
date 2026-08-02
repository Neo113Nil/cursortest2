package com.paypal.oslo.feature.identity.userverification.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl", f = "VerifyCredentialRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {74}, m = "verify", n = {"verifyCredentialRequest", "raise$iv$iv$iv", "$this$verify_u24lambda_u240", "verifyCredentialInput", "grantType", "config", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifyCredentialRepositoryImpl$verify$2"}, nl = {86}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class VerifyCredentialRepositoryImpl$verify$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizes.verify(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerifyCredentialRepositoryImpl$verify$1(com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl verifyCredentialRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl$verify$1> continuation) {
        super(continuation);
        this.getOutputSizes = verifyCredentialRepositoryImpl;
    }
}
