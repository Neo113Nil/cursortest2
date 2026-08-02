package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl", f = "DeviceRegistrationInformationImpl.kt", i = {}, l = {60}, m = "getPayPalDeviceId", n = {}, nl = {61}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationInformationImpl$getPayPalDeviceId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getPayPalDeviceId(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationInformationImpl$getPayPalDeviceId$1(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl deviceRegistrationInformationImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$getPayPalDeviceId$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationInformationImpl;
    }
}
