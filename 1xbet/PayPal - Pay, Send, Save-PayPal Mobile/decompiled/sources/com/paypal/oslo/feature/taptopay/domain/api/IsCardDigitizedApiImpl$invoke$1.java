package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl", f = "IsCardDigitizedApiImpl.kt", i = {0, 0}, l = {32}, m = "invoke", n = {"paypalCardIds", "internalIds"}, nl = {33}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class IsCardDigitizedApiImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IsCardDigitizedApiImpl$invoke$1(com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl isCardDigitizedApiImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = isCardDigitizedApiImpl;
    }
}
