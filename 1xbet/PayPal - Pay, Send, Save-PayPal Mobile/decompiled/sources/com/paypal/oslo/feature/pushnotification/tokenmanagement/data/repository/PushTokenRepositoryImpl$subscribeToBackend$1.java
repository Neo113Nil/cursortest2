package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {75}, m = "subscribeToBackend", n = {"tokenSubscribeRequest", "raise$iv$iv$iv", "$this$subscribeToBackend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PushTokenRepositoryImpl$subscribeToBackend$2"}, nl = {81}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenRepositoryImpl$subscribeToBackend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputSizes.subscribeToBackend(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenRepositoryImpl$subscribeToBackend$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl pushTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.repository.PushTokenRepositoryImpl$subscribeToBackend$1> continuation) {
        super(continuation);
        this.getOutputSizes = pushTokenRepositoryImpl;
    }
}
