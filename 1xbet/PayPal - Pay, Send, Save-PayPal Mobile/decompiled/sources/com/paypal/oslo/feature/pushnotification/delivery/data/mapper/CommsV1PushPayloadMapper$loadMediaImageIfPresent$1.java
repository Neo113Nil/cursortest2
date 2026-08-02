package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper", f = "CommsV1PushPayloadMapper.kt", i = {0}, l = {328}, m = "loadMediaImageIfPresent", n = {"payload"}, nl = {329}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CommsV1PushPayloadMapper$loadMediaImageIfPresent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommsV1PushPayloadMapper$loadMediaImageIfPresent$1(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper commsV1PushPayloadMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$loadMediaImageIfPresent$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = commsV1PushPayloadMapper;
    }
}
