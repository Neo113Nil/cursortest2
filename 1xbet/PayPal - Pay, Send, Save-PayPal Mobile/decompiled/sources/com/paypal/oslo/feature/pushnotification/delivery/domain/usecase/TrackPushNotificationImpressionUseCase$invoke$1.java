package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase", f = "TrackPushNotificationImpressionUseCase.kt", i = {0}, l = {43}, m = "invoke", n = {"trackingToken"}, nl = {63}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class TrackPushNotificationImpressionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackPushNotificationImpressionUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase trackPushNotificationImpressionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = trackPushNotificationImpressionUseCase;
    }
}
