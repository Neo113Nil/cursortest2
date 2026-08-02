package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl", f = "DeviceRegistrationInformationImpl.kt", i = {}, l = {78}, m = "isPaymentAppInstanceIdRegistered", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.isPaymentAppInstanceIdRegistered(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1(com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl deviceRegistrationInformationImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.DeviceRegistrationInformationImpl$isPaymentAppInstanceIdRegistered$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationInformationImpl;
    }
}
