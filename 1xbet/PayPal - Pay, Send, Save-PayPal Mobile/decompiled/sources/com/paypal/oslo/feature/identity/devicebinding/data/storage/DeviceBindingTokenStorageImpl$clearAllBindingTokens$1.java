package com.paypal.oslo.feature.identity.devicebinding.data.storage;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl", f = "DeviceBindingTokenStorageImpl.kt", i = {0, 0, 0, 0, 0}, l = {54}, m = "clearAllBindingTokens", n = {"$this$forEach$iv", "element$iv", "method", "$i$f$forEach", "$i$a$-forEach-DeviceBindingTokenStorageImpl$clearAllBindingTokens$2"}, nl = {55}, s = {"L$0", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class DeviceBindingTokenStorageImpl$clearAllBindingTokens$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputFormats.clearAllBindingTokens(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceBindingTokenStorageImpl$clearAllBindingTokens$1(com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl deviceBindingTokenStorageImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl$clearAllBindingTokens$1> continuation) {
        super(continuation);
        this.getOutputFormats = deviceBindingTokenStorageImpl;
    }
}
