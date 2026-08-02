package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl", f = "BusinessInventoryItemsRepositoryImpl.kt", i = {0, 0}, l = {136}, m = "saveItem", n = {"item", "mutation"}, nl = {137}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsRepositoryImpl$saveItem$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.saveItem(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsRepositoryImpl$saveItem$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl businessInventoryItemsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = businessInventoryItemsRepositoryImpl;
    }
}
