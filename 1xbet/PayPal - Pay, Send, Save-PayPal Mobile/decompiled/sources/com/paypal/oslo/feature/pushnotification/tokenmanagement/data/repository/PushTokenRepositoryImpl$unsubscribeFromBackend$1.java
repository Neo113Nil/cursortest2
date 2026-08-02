package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {101}, m = "unsubscribeFromBackend", n = {"deviceId", "pushToken", "raise$iv$iv$iv", "$this$unsubscribeFromBackend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenRepositoryImpl$unsubscribeFromBackend$2"}, nl = {105}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenRepositoryImpl$unsubscribeFromBackend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.unsubscribeFromBackend(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenRepositoryImpl$unsubscribeFromBackend$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl pushTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$unsubscribeFromBackend$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = pushTokenRepositoryImpl;
    }
}
