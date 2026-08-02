package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2", f = "PushSubscriptionStateObserver.kt", i = {0, 0}, l = {116}, m = "emit", n = {"authState", "permissionGranted"}, nl = {163}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass2<T> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass2;
    }
}
