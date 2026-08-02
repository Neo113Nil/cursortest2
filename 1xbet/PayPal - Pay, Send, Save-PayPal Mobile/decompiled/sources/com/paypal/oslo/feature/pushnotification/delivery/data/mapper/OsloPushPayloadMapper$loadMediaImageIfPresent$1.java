package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper", f = "OsloPushPayloadMapper.kt", i = {0}, l = {256}, m = "loadMediaImageIfPresent", n = {"payload"}, nl = {257}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class OsloPushPayloadMapper$loadMediaImageIfPresent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OsloPushPayloadMapper$loadMediaImageIfPresent$1(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper osloPushPayloadMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper$loadMediaImageIfPresent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = osloPushPayloadMapper;
    }
}
