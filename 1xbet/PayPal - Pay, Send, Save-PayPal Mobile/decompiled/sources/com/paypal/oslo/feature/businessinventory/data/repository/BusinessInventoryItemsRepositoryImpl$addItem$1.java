package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl", f = "BusinessInventoryItemsRepositoryImpl.kt", i = {0, 0}, l = {109}, m = "addItem", n = {"item", "mutation"}, nl = {110}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsRepositoryImpl$addItem$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.addItem(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsRepositoryImpl$addItem$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl businessInventoryItemsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = businessInventoryItemsRepositoryImpl;
    }
}
