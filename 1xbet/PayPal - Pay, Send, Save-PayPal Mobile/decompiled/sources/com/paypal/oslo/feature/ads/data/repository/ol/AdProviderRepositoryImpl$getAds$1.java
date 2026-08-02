package com.paypal.oslo.feature.ads.data.repository.ol;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl", f = "AdProviderRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {80, 81, 107}, m = "getAds-BWLJW6A", n = {"appVersion", "publisher", "page", "appVersion", "publisher", "page", "userIdentifier", "appVersion", "publisher", "page", "userIdentifier", "userCountry", "request"}, nl = {81, 84, 109}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class AdProviderRepositoryImpl$getAds$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        java.lang.Object mo11971getAdsBWLJW6A = this.getInputFormats.mo11971getAdsBWLJW6A(null, null, null, this);
        return mo11971getAdsBWLJW6A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo11971getAdsBWLJW6A : kotlin.Result.m23435boximpl(mo11971getAdsBWLJW6A);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdProviderRepositoryImpl$getAds$1(com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl adProviderRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.repository.ol.AdProviderRepositoryImpl$getAds$1> continuation) {
        super(continuation);
        this.getInputFormats = adProviderRepositoryImpl;
    }
}
