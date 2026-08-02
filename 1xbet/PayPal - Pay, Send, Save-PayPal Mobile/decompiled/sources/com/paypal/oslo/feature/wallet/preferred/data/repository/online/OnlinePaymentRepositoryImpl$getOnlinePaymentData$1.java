package com.paypal.oslo.feature.wallet.preferred.data.repository.online;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl", f = "OnlinePaymentRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {46}, m = "getOnlinePaymentData", n = {"combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$getOnlinePaymentData_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-OnlinePaymentRepositoryImpl$getOnlinePaymentData$3"}, nl = {50}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes16.dex */
final class OnlinePaymentRepositoryImpl$getOnlinePaymentData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.getOnlinePaymentData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnlinePaymentRepositoryImpl$getOnlinePaymentData$1(com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl onlinePaymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl$getOnlinePaymentData$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = onlinePaymentRepositoryImpl;
    }
}
