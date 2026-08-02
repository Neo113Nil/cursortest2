package com.paypal.oslo.feature.identity.devicebinding.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl", f = "DeviceAuthPreferenceStorageImpl.kt", i = {0}, l = {48}, m = "isDisabledByUser", n = {"method"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DeviceAuthPreferenceStorageImpl$isDisabledByUser$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.isDisabledByUser(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceAuthPreferenceStorageImpl$isDisabledByUser$1(com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl deviceAuthPreferenceStorageImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$isDisabledByUser$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = deviceAuthPreferenceStorageImpl;
    }
}
