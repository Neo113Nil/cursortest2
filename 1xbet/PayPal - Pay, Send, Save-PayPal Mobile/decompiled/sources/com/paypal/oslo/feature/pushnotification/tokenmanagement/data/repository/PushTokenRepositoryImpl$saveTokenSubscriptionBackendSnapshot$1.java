package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {56}, m = "saveTokenSubscriptionBackendSnapshot", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "raise$iv$iv$iv", "$this$saveTokenSubscriptionBackendSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$2"}, nl = {57}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.saveTokenSubscriptionBackendSnapshot(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl pushTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$saveTokenSubscriptionBackendSnapshot$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = pushTokenRepositoryImpl;
    }
}
