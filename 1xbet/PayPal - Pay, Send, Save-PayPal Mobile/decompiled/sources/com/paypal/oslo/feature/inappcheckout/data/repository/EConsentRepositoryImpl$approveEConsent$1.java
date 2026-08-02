package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl", f = "EConsentRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {91}, m = "approveEConsent", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$approveEConsent_u24lambda_u240", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EConsentRepositoryImpl$approveEConsent$2"}, nl = {101}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class EConsentRepositoryImpl$approveEConsent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EConsentRepositoryImpl$approveEConsent$1(com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl eConsentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.EConsentRepositoryImpl$approveEConsent$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = eConsentRepositoryImpl;
    }
}
