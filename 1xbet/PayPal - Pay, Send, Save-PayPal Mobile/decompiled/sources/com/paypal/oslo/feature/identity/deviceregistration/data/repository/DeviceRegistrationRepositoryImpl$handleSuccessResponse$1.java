package com.paypal.oslo.feature.identity.deviceregistration.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl", f = "DeviceRegistrationRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {147, 148, 149}, m = "handleSuccessResponse", n = {"deviceId", "deviceConfirmed", "paymentAppInstanceId", "output", "paidWasSent", "deviceId", "deviceConfirmed", "paymentAppInstanceId", "output", "paidWasSent", "deviceId", "deviceConfirmed", "paymentAppInstanceId", "output", "paidWasSent"}, nl = {148, 149, 150}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class DeviceRegistrationRepositoryImpl$handleSuccessResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationRepositoryImpl$handleSuccessResponse$1(com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl deviceRegistrationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$handleSuccessResponse$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = deviceRegistrationRepositoryImpl;
    }
}
