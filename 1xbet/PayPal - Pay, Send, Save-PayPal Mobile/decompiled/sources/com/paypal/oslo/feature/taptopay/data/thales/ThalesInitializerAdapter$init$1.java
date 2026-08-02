package com.paypal.oslo.feature.taptopay.data.thales;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter", f = "ThalesInitializerAdapter.kt", i = {0, 0, 0}, l = {89}, m = "init", n = {"paymentActivity", "baseUrl", "thalesInitializer"}, nl = {90}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class ThalesInitializerAdapter$init$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.init(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesInitializerAdapter$init$1(com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter thalesInitializerAdapter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter$init$1> continuation) {
        super(continuation);
        this.getInputFormats = thalesInitializerAdapter;
    }
}
