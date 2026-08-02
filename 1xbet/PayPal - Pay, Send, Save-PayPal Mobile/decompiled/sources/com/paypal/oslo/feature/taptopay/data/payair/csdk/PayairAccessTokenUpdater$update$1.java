package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater", f = "PayairAccessTokenUpdater.kt", i = {}, l = {46}, m = "update", n = {}, nl = {47}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayairAccessTokenUpdater$update$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.update(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairAccessTokenUpdater$update$1(com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater payairAccessTokenUpdater, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater$update$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = payairAccessTokenUpdater;
    }
}
