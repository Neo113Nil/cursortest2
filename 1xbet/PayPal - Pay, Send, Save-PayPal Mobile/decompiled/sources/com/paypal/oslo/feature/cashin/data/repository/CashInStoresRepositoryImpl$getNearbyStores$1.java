package com.paypal.oslo.feature.cashin.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl", f = "CashInStoresRepositoryImpl.kt", i = {0, 0, 0}, l = {54}, m = "getNearbyStores", n = {"geoLocation", "query", "limit"}, nl = {78}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class CashInStoresRepositoryImpl$getNearbyStores$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.getNearbyStores(null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInStoresRepositoryImpl$getNearbyStores$1(com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl cashInStoresRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1> continuation) {
        super(continuation);
        this.getOutputFormats = cashInStoresRepositoryImpl;
    }
}
