package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {62}, m = "getTokenSubscriptionBackendSnapshot", n = {"raise$iv$iv$iv", "$this$getTokenSubscriptionBackendSnapshot_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$2"}, nl = {121}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.getTokenSubscriptionBackendSnapshot(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl pushTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$getTokenSubscriptionBackendSnapshot$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = pushTokenRepositoryImpl;
    }
}
