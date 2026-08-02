package com.paypal.oslo.feature.taptopay.data.sdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer", f = "CompositeSdkInitializer.kt", i = {0}, l = {87}, m = "initSdk", n = {"block"}, nl = {88}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class CompositeSdkInitializer$initSdk$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeSdkInitializer$initSdk$1(com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer compositeSdkInitializer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$initSdk$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = compositeSdkInitializer;
    }
}
