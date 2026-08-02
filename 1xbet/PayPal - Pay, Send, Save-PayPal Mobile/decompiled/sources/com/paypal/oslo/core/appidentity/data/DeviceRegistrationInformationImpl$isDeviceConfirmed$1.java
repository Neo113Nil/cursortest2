package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl", f = "DeviceRegistrationInformationImpl.kt", i = {}, l = {74}, m = "isDeviceConfirmed", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationInformationImpl$isDeviceConfirmed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.isDeviceConfirmed(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationInformationImpl$isDeviceConfirmed$1(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl deviceRegistrationInformationImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceConfirmed$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = deviceRegistrationInformationImpl;
    }
}
