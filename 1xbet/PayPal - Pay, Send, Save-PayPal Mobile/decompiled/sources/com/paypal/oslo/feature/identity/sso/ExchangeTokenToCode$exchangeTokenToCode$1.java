package com.paypal.oslo.feature.identity.sso;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode", f = "ExchangeTokenToCode.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {91}, m = "exchangeTokenToCode", n = {"authContext", "raise$iv$iv$iv", "$this$exchangeTokenToCode_u24lambda_u240", "pkcePair", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PARAM_CODE_CHALLENGE, "graphQLIntent", "request", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ExchangeTokenToCode$exchangeTokenToCode$2"}, nl = {94}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class ExchangeTokenToCode$exchangeTokenToCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizes.exchangeTokenToCode(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExchangeTokenToCode$exchangeTokenToCode$1(com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode exchangeTokenToCode, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode$exchangeTokenToCode$1> continuation) {
        super(continuation);
        this.getOutputSizes = exchangeTokenToCode;
    }
}
