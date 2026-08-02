package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper", f = "CommsV1PushPayloadMapper.kt", i = {0}, l = {67}, m = "tryMap", n = {"payload"}, nl = {70}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CommsV1PushPayloadMapper$tryMap$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.tryMap(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommsV1PushPayloadMapper$tryMap$1(com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper commsV1PushPayloadMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper$tryMap$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = commsV1PushPayloadMapper;
    }
}
