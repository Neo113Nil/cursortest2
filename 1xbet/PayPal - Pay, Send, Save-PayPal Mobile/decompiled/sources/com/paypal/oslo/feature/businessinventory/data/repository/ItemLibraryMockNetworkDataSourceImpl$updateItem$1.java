package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl", f = "ItemLibraryMockNetworkDataSource.kt", i = {0}, l = {49}, m = "updateItem", n = {"item"}, nl = {51}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class ItemLibraryMockNetworkDataSourceImpl$updateItem$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateItem(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemLibraryMockNetworkDataSourceImpl$updateItem$1(com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl itemLibraryMockNetworkDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$updateItem$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = itemLibraryMockNetworkDataSourceImpl;
    }
}
