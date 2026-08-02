package com.paypal.oslo.feature.identity.deviceregistration.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl", f = "DeviceRegistrationRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {76, 83, 88}, m = "register", n = {"paymentAppInstanceId", "input", "mutation", "config", "paymentAppInstanceId", "input", "mutation", "config", "this_$iv", "response", "result", "$i$f$fold", "$i$a$-fold-DeviceRegistrationRepositoryImpl$register$3", "paymentAppInstanceId", "input", "mutation", "config", "this_$iv", "error", "response", "result", "$i$f$fold", "$i$a$-fold-DeviceRegistrationRepositoryImpl$register$4"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class DeviceRegistrationRepositoryImpl$register$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl getOutputMinFrameDurationlomOqCM;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.register(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceRegistrationRepositoryImpl$register$1(com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl deviceRegistrationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$register$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = deviceRegistrationRepositoryImpl;
    }
}
