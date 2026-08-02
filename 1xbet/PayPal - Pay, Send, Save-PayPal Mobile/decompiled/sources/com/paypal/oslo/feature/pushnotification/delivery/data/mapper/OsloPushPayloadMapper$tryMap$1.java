package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper", f = "OsloPushPayloadMapper.kt", i = {0, 0}, l = {81}, m = "tryMap", n = {"payload", "notificationId"}, nl = {84}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class OsloPushPayloadMapper$tryMap$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.tryMap(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OsloPushPayloadMapper$tryMap$1(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper osloPushPayloadMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$tryMap$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = osloPushPayloadMapper;
    }
}
