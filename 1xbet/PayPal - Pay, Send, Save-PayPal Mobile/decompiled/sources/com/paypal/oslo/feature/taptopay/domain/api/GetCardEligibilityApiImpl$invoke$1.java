package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl", f = "GetCardEligibilityApiImpl.kt", i = {0, 0, 0}, l = {35}, m = "invoke", n = {"id", "clientMetadataId", "cardTypes"}, nl = {39}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class GetCardEligibilityApiImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCardEligibilityApiImpl$invoke$1(com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl getCardEligibilityApiImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = getCardEligibilityApiImpl;
    }
}
