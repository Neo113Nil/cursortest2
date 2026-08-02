package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl", f = "ItemLibraryMockNetworkDataSource.kt", i = {}, l = {44}, m = "getInventoryItems", n = {}, nl = {45}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getInventoryItems(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1(com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl itemLibraryMockNetworkDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = itemLibraryMockNetworkDataSourceImpl;
    }
}
