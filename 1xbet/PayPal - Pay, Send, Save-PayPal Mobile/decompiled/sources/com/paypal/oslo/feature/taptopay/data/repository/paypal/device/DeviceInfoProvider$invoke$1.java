package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider", f = "DeviceInfoProvider.kt", i = {}, l = {47}, m = "invoke", n = {}, nl = {49}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DeviceInfoProvider$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeviceInfoProvider$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider deviceInfoProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = deviceInfoProvider;
    }
}
