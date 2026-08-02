package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BusinessInventoryItemsListScreenKt$BusinessInventoryItemsListScreen$1$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent) {
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent2 = businessInventoryItemsListEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsListEvent2, "");
        ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel) this.receiver).handleEvent$business_inventory_prodRelease(businessInventoryItemsListEvent2);
        return kotlin.Unit.INSTANCE;
    }

    BusinessInventoryItemsListScreenKt$BusinessInventoryItemsListScreen$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel.class, "handleEvent", "handleEvent$business_inventory_prodRelease(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;)Lkotlinx/coroutines/Job;", 8);
    }
}
