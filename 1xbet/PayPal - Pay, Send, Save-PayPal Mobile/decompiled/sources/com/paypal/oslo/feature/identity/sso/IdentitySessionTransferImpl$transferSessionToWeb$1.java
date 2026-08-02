package com.paypal.oslo.feature.identity.sso;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl", f = "IdentitySessionTransferImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {78}, m = "transferSessionToWeb", n = {"authenticationContext", "raise$iv$iv$iv", "$this$transferSessionToWeb_u24lambda_u240", "pkcePair", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PARAM_CODE_CHALLENGE, "graphQLIntent", "request", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-IdentitySessionTransferImpl$transferSessionToWeb$2"}, nl = {81}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class IdentitySessionTransferImpl$transferSessionToWeb$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.transferSessionToWeb(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentitySessionTransferImpl$transferSessionToWeb$1(com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl identitySessionTransferImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl$transferSessionToWeb$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = identitySessionTransferImpl;
    }
}
