package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl", f = "GetCardApiImpl.kt", i = {0, 0}, l = {35}, m = "invoke", n = {"id", "getCardArt"}, nl = {38}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetCardApiImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCardApiImpl$invoke$1(com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl getCardApiImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getCardApiImpl;
    }
}
