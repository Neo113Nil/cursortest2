package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase", f = "TrackPushNotificationClickUseCase.kt", i = {0}, l = {43}, m = "invoke", n = {"trackingToken"}, nl = {63}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class TrackPushNotificationClickUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackPushNotificationClickUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase trackPushNotificationClickUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = trackPushNotificationClickUseCase;
    }
}
