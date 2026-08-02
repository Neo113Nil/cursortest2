package com.paypal.oslo.feature.pushnotification.shared.domain.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl", f = "DeviceIdProviderImpl.kt", i = {}, l = {42, 45}, m = "getDeviceId", n = {}, nl = {53, 46}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DeviceIdProviderImpl$getDeviceId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getDeviceId(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceIdProviderImpl$getDeviceId$1(com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl deviceIdProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl$getDeviceId$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = deviceIdProviderImpl;
    }
}
