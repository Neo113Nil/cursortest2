package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl", f = "PushTokenDataServiceImpl.kt", i = {0, 0}, l = {69}, m = "unSubscribePushToken", n = {"deviceId", "pushToken"}, nl = {78}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenDataServiceImpl$unSubscribePushToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.unSubscribePushToken(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenDataServiceImpl$unSubscribePushToken$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl pushTokenDataServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$unSubscribePushToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = pushTokenDataServiceImpl;
    }
}
