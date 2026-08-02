package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl", f = "DeviceRegistrationSignalImpl.kt", i = {0}, l = {36}, m = "awaitDeviceId", n = {"timeoutMs"}, nl = {38}, s = {"J$0"}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationSignalImpl$awaitDeviceId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.awaitDeviceId(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationSignalImpl$awaitDeviceId$1(com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl deviceRegistrationSignalImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationSignalImpl$awaitDeviceId$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = deviceRegistrationSignalImpl;
    }
}
