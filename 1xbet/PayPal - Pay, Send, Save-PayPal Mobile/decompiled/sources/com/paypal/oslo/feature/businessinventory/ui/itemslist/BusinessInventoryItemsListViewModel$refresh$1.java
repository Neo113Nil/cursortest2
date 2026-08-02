package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel", f = "BusinessInventoryItemsListViewModel.kt", i = {}, l = {100}, m = "refresh$business_inventory_prodRelease", n = {}, nl = {101}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsListViewModel$refresh$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.refresh$business_inventory_prodRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsListViewModel$refresh$1(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$refresh$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = businessInventoryItemsListViewModel;
    }
}
