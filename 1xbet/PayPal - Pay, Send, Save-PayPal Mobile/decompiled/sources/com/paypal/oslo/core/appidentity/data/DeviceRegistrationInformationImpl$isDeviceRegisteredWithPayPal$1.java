package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl", f = "DeviceRegistrationInformationImpl.kt", i = {}, l = {66}, m = "isDeviceRegisteredWithPayPal", n = {}, nl = {66}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.isDeviceRegisteredWithPayPal(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl deviceRegistrationInformationImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isDeviceRegisteredWithPayPal$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = deviceRegistrationInformationImpl;
    }
}
