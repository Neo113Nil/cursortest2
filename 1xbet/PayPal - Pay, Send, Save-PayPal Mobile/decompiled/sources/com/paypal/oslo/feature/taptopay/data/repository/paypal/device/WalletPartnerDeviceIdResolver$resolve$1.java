package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver", f = "WalletPartnerDeviceIdResolver.kt", i = {0}, l = {40}, m = "resolve", n = {"isPayPalWallet"}, nl = {41}, s = {"Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class WalletPartnerDeviceIdResolver$resolve$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.resolve(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WalletPartnerDeviceIdResolver$resolve$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver walletPartnerDeviceIdResolver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver$resolve$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = walletPartnerDeviceIdResolver;
    }
}
