package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl", f = "CardFormDataRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {74}, m = "fetchCardFormData", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "fiId", "raise$iv$iv$iv", "$this$fetchCardFormData_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CardFormDataRepositoryImpl$fetchCardFormData$2"}, nl = {80}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class CardFormDataRepositoryImpl$fetchCardFormData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardFormDataRepositoryImpl$fetchCardFormData$1(com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl cardFormDataRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl$fetchCardFormData$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = cardFormDataRepositoryImpl;
    }
}
