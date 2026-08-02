package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl", f = "DeviceRegistrationInformationImpl.kt", i = {0}, l = {54}, m = "persistPayPalDeviceId", n = {"paypalDeviceId"}, nl = {55}, s = {"L$0"}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationInformationImpl$persistPayPalDeviceId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.persistPayPalDeviceId(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationInformationImpl$persistPayPalDeviceId$1(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl deviceRegistrationInformationImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$persistPayPalDeviceId$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = deviceRegistrationInformationImpl;
    }
}
