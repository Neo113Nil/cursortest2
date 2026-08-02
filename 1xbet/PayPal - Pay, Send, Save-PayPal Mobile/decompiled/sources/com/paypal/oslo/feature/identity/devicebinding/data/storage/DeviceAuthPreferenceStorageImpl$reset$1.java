package com.paypal.oslo.feature.identity.devicebinding.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl", f = "DeviceAuthPreferenceStorageImpl.kt", i = {0, 0, 0, 0, 0}, l = {53}, m = "reset", n = {"$this$forEach$iv", "element$iv", "method", "$i$f$forEach", "$i$a$-forEach-DeviceAuthPreferenceStorageImpl$reset$2"}, nl = {54}, s = {"L$0", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class DeviceAuthPreferenceStorageImpl$reset$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.reset(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceAuthPreferenceStorageImpl$reset$1(com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl deviceAuthPreferenceStorageImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl$reset$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = deviceAuthPreferenceStorageImpl;
    }
}
