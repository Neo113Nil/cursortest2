package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl", f = "MerchantInsightsRepositoryImpl.kt", i = {}, l = {39}, m = "getMerchantInsights", n = {}, nl = {44}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class MerchantInsightsRepositoryImpl$getMerchantInsights$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getMerchantInsights(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantInsightsRepositoryImpl$getMerchantInsights$1(com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl merchantInsightsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl$getMerchantInsights$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = merchantInsightsRepositoryImpl;
    }
}
